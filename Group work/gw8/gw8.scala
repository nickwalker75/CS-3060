
// Task 1
def getLastWord (t : String): String =
{  
    val list = t.split("\\s+" )

    //(a) Get the size of list
    var listSize = list.size

    // (b) from list get the last item (i.e. the last word of t )
    var lastItem = list(listSize - 1)

    //(c) return the last word of t
    return lastItem

    
}

// Task 2
def getLastChar (a:String):Char =
{
    //(a) Get the size of the string a
    var stringSize = a.size


    // (b) from string a get the last char by String library function charAt . (google it)
    var lastChar = a.charAt(stringSize - 1)


    //(c) return the last char of s
    return lastChar

}



// Task 1
//
// println(getLastWord("123 qbdf rtyu 34"))
// println(getLastChar("abc 123 sd 34"))


