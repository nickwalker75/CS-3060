// imports
import scala.io._

object PageLoader {
  val scriptRegex = "<script.*</script>".r
  val imgRegex = "<img.+?src=\"(.+?)\".*>".r
  val linkRegex =   "(?i)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r


  def getNumImg(url: String) = {
    val page = Source.fromURL(url)("ISO-8859-1").mkString

    // get num img's
    val numImg = imgRegex.findAllIn(page).matchData.toList.size
    numImg
  }

  def getNumScripts(url: String) = {
    val page = Source.fromURL(url)("ISO-8859-1").mkString

    // get num scripts
    val numScripts = scriptRegex.findAllIn(page).matchData.toList.size
    numScripts
  }

  def getNumLinks(url: String) = {
    val page = Source.fromURL(url)("ISO-8859-1").mkString

    // get numLinks
    val numLinks = linkRegex.findAllIn(page).matchData.toList.map(_.group(1))
    numLinks
  }
}

def getNumImgG2Par(urls: List[String]) = {
  val numImg = urls.par map(url=>PageLoader.getNumImg(url))
  val totalImgG2 = numImg.count(x => x > 2)

  totalImgG2
}

print("Enter url: ")
val url:String = scala.io.StdIn.readLine()
val urls = PageLoader.getNumLinks(url)

val t1 = System.currentTimeMillis()
val totalImgG2Par = getNumImgG2Par(urls)
val t2 = System.currentTimeMillis()

println("par exec time = " + (t2 - t1))