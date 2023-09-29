# Task 1
def foo(arr)
    return arr.map{ |x| x = x%3}

end

puts foo([12, 15, 18, 65, 74])

# Task 2
def genRandomMatrix(x, y)
    a = [ ]
    (1..x).each do
            b = [ ]
            (1..y).each do
                    i = rand(10..20) #you may need to fill in a parameter in rand( ) here
                    b.push(i)
            end
            a.push(b)
    end
    a
end

def printMatrix(a)
    a.each do |row|
        print row
        print "\n"
    end
end

randMatrix = genRandomMatrix(10, 15)
printMatrix(randMatrix)

# Task 3
def seriesUpTo(max) # this func receives a code block
    i = 1       
    while i <= max
        yield i*i    # see correspondence b/w i*i and x in block later.
        i += 1
    end
end
  
seriesUpTo(100) { |x| puts x + 1 } # this will print some series
puts "\n"
  