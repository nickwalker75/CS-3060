// import
import scala.io._
import scala.util.Random

abstract class Shape() {
  var color: String = "white"
  def perimeter: Double
}

class Circle() extends Shape {
  val radius = 2
  override def perimeter: Double = 2 * 3.14 * radius
}

class Square() extends Shape {
  val sides = 4
  override def perimeter: Double = sides * 2
}

class Hexagon() extends Shape {
  val sides = 6
  override def perimeter: Double = sides * 3
}

// get rand num
val r = new Random()
var shapes = new Array[Shape](40)

// gen random shapes
for (i <- 0 to (shapes.size - 1)) {
    
  val randNum = r.nextInt(3)

  // create shape
  if (randNum == 0) {
    // add circle to array
    shapes(i) = new Circle()
  } else if (randNum == 1) {
    // add square to array
    shapes(i) = new Square()
  } else if (randNum == 2) {
    // add hexagon to array
    shapes(i) = new Hexagon()
  }
}

// get total perimeter
var totalPer = 0.0

for(i <- shapes){
  totalPer = totalPer + i.perimeter
}

print("Total Perimeter: ")
println(totalPer)