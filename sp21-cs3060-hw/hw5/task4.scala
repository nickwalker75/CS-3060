object task4 {
  def main(arg: Array[String]) = {
    sumOfPower
  }

  def sumOfPower = {
    var sum: Long = 0
    var temp: Long = 1

    for (i <- 1 to 10) {
      for (j <- 1 until i) {
        temp *= i
      }
      sum += temp
      temp = 1
    }

    println(sum)
  }
}
