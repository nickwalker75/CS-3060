// import

def foo3(stringList: List[String]) = {
    val newList = stringList.map(str => 
        if(str == stringList(stringList.size - 1))
        {
            str.charAt(0).toString
        }else{
            str.charAt(0).toString + "-"
        }
    ).fold(""){(sum,item) => sum+item}

    println(result)
}

foo3(List("12ab", "cde", "xyz"))