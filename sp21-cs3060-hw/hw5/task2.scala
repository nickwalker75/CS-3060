import scala.io.Source
import scala.util.control.Breaks._

object task2 {
  def main(args: Array[String]) = {
    print("Enter name of File: ")
    val fileName = Console.readLine()

    val lines = Source.fromFile(fileName).getLines

    var flag = false
    breakable {
      for (line <- lines) {
        if (line.contains("cpp") || line.contains("ruby")) {
          println("The file content is not good enogh")
          break
        } else if (line.contains("java") || line.contains("scala")) {
          println("The file is worthy of study")
          break
        } else {
          flag = true
        }
      }
    }

    if (flag == true) {
      println("File is meaningless")
    }

  }
}
