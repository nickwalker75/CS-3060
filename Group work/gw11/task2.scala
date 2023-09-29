// import

def foo2(stringList: List[String]) = {
    //val newList = stringList.map(str => 
    //    if(str == stringList(stringList.size - 1)){
    //        str.charAt(0).toString
    //    }else{
    //        str.charAt(0).toString + "-"
    //    }
    //).reduce(_+_)

    val newList = stringList.map(str => str.charAt(0).toString)
    val result = newList.reduce(_+"-"+_)
    

    println(result)
}

foo2(List("12ab", "cde", "xyz"))