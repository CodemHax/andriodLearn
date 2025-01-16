//Strings
fun main(){
    val string : String = "Hello World"
    println(" Length of String: " +  string.length )
    for (i in 0..<string.length - 1)
    println("Index Function: " + "${string[i]}")
    println("Substring Function: " + string.substring(6,11))
    println("UpperCase: " + string.uppercase())
    println("LowerCase: " + string.lowercase())
    println(string.trim())
    println(string.contains("Hello"))
    println(string.replace("o","O"))
    println(string.split(" "))
    println( "$" + "OK")

}

