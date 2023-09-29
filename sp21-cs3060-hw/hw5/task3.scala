object task3 {
  def main(args: Array[String]) = {

    var a = 5
    var b = a * a

    for (i <- 1 until 21) {
      println(s"The square of $a is $b")
      a += 1
      b = a * a

    }
  }
}
