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

def getUrlImg(urls: List[String]) = {
  val numImg = urls.map(url=>PageLoader.getNumImg(url))
  val totalImg = numImg.reduce(_+_)
  
  totalImg
}

def getNumImgG2(urls: List[String]) = {
  val numImg = urls.map(url=>PageLoader.getNumImg(url))
  val totalImgG2 = numImg.count(x => x > 2)

  totalImgG2
}

def getNumImgG2Par(urls: List[String]) = {
  val numImg = urls.par map(url=>PageLoader.getNumImg(url))
  val totalImgG2 = numImg.count(x => x > 2)

  totalImgG2
}

// Task 2a
print("Enter url: ")
val url:String = scala.io.StdIn.readLine()

val numImg = PageLoader.getNumImg(url)
val numScripts = PageLoader.getNumScripts(url)
val urls = PageLoader.getNumLinks(url)

print("Num Images: ")
println(numImg)
print("Num Scripts: ")
println(numScripts)

// Task 2b
val totalImg = getUrlImg(urls)

print("Total Num Images: ")
println(totalImg)

// Task 2c
val t1 = System.currentTimeMillis()
val totalImgG2 = getNumImgG2(urls)
val t2 = System.currentTimeMillis()

print("Num of Links w/2+ Img's: ")
println(totalImgG2)

// Task 2d
val t3 = System.currentTimeMillis()
val totalImgG2Par = getNumImgG2Par(urls)
val t4 = System.currentTimeMillis()

print("Num of Links w/2+ Img's: ")
println(totalImgG2Par)

println("serial exec time = " + (t2 - t1))
println("par exec time = " + (t4 - t3))