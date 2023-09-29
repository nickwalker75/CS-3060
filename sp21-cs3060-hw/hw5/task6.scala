import scala.io.Source
import java.util.HashMap

object task6 {
  def main(args: Array[String]) = {
    // open stories
    val story1 = Source.fromFile("story1.txt").getLines()
    val story2 = Source.fromFile("stroy2.txt").getLines()

    // init variables
    var s1Freq = new HashMap[String, Int]
    var s2Freq = new HashMap[String, Int]

    // process stroy 1
    val s1wc = s1Freq
      .flatMap(l => l.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    // process story 2
    val s2wc = s2Freq
      .flatMap(l => l.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    // get unique words
    for (i <- 1 to s2Sorted.length) {}

    // close stories
    story1.close()
    story2.close()

    // print results
    println("Story 1: ")
    println(s" - unique words: ")

  }
}
