// imports
import scala.io._

object PageLoader {
  val linkRegex = "(?i)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r

  def getNumLinks(url: String) = {
    val page = Source.fromURL(url)("ISO-8859-1").mkString

    // get numLinks
    val numLinks = linkRegex.findAllIn(page).matchData.toList.map(_.group(1))
    numLinks
  }
}

// get stories from website
val stories = PageLoader.getNumLinks("http://www.textfiles.com/stories/")



