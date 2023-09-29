// import
import scala.math.pow
import scala.io._

def foo1(x: List[Int]) = {
    val y = x.map(num => pow(2, num))

    val sum = y.reduce(_+_)

    println(y)
    println(sum)

}

def foo1Par(x: List[Int]) = {
    val y = x.par map(num => pow(2, num))
    val sum = y.reduce(_+_)

    println(y)
    println(sum)
}

val t1 = System.currentTimeMillis()
foo1(List(2, 5, 8, 3, 6, 8, 3, 6, 2, 7))
val t2 = System.currentTimeMillis()

val t3 = System.currentTimeMillis()
foo1Par(List(2, 5, 8, 3, 6, 8, 3, 6, 2, 7))
val t4 = System.currentTimeMillis()

println("serial exec time = " + (t2 - t1))
println("par exec time = " + (t4 - t3))