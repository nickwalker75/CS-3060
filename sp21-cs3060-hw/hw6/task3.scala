// import
import scala.io._

def foo(t: List[String]) = {
    val unique = t.map{ str => str.distinct}
    val numUnique = unique.map{ str => str.size}

    numUnique
}

def foo1(t: List[Int]) = {
    val swapped = t.grouped(2)
                    .flatMap{
                        case List(x,y) => List(y,x)
                        case List(x) => List(x)
                    }.toList

    swapped
}

// Task 3a
val numUnique = foo(List("aabcdb", "bcdd"))
print("Num of Unique Char's: ")
println(numUnique)

// Task 3b
val swappedList = foo1(List(3,4,5,6,7,8))
print("Swapped List: ")
println(swappedList)
