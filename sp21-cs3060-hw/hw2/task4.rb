class Tree
    attr_accessor :children, :node_name
        
    def initialize(name, children = [])
        if name.respond_to?('keys')
            root = name.first
            name = root[0]
            children = root[1]
        end

        if children.respond_to?('keys')
            children = children.map {|parent, child| Tree.new(parent, child) }
        end

        @node_name = name
        @children = children
    end

    def visit_all(&block)
        yield(self)
        children.each { |c| c.visit_all(&block)}    
    end

end

ruby_tree = Tree.new( { 'ggrandparent' => 
    {
        'grandparent1' =>
            { 
                'parent1'  => { 'child1' => { } , 'child2' => { } } ,
                'parent2'  => { 'child3' => { } }
            } ,
        'grandparent2'=>
            { 
                'parent3'=> {'child4'=> { } } ,
                'parent4'=> {'child5'=> { } ,'child6'=> { } }
            }
      }
} )

cnt = 0

ruby_tree.visit_all do |n| 
    puts n.node_name
    cnt += 1
end

puts "Total: #{cnt}"
