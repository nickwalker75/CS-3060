import scala.io.Source
import java.io.File
import java.io.PrintWriter

object task1 {
  def main(args: Array[String]) = {
    // make file object
    val outFile = new PrintWriter(new File("myLines.txt"))

    // get input
    println("Enter 3 lines of text: ")
    for (i <- 1 until 3) {
      var input = Console.readLine()
      outFile.write(input + "\n")
    }

    outFile.close()
  }
}
