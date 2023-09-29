import scala.io.Source

object Task2 {
    def main (args:Array[String])
    {
        var price = 0
        var costliestItem = " "
        var lineCount = 0
        var max = -100
        //Below we get a file-handler for the file “data.txt”
        
        val fileHandler  =  Source.fromFile("data.txt")
        val lineIterator = fileHandler.getLines

        //Iterate over all lines
        for(line <- lineIterator)
        {
            //(a) Increment the lineCount
            lineCount += 1

            //(b) Process the current line
            var list = line.split("\\s+")
            println(list(2))

            var cost = line(2).toInt

            //(c) you may need to change the price item in the third column from String to Int. 
            //    If s is a string, then s.toInt gives the corresponding Int
            if(list(0) == "Pen"){
                price = list(2).toInt
            }

            if(list(2).toInt > max){
                max = list()
                costliestItem = list(0)
            }


        }   
        
        // Print all the outputs
        println(lineCount)
        println(price)
        println(costliestItem)


        fileHandler.close()
    }
}