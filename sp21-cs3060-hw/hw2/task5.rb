class Shape
    attr_accessor :color, :area
    def initialize(color)
        @color = 'red'
    end
end

class Square < Shape
    attr_accessor :sides
    def initialize(sides)
        super
        @sides = sides
    end

    def getArea
        @sides * @sides
    end
end

class Circle < Shape
    attr_accessor :radius
    def initialize(radius)
        super
        @radius = radius
    end

    def getArea
        Math::PI * (@radius ** 2)
    end
end

randShapes = []
for i in 0..100
    ranNum = rand(2)
    if ranNum == 0
        s = Square.new(rand(0..50))
        randShapes.push(s)
    else
        c = Circle.new(rand(0..50))
        randShapes.push(c)
    end
end

randShapes.each { |shape| puts shape.getArea }