fun main(){
    val fruits = arrayOf("Apple",4,"test")
    println(fruits)
    for(i in fruits){
       println(i)
    }
}



fun main() {
   val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
   val stringList = mutableListOf(
       "Kotlin",
       "Java",
       "Python",
       "JavaScript",
       "Swift",
       "C++",
       "Ruby",
       "PHP",
       "Go",
       "Rust"
   )
   val newList = mutableListOf<Any>()
   var newEelement : Int
   for(i in list){
       newEelement = i + i
       newList.addLast(newEelement)
   }
   println(newList)

   var newList = mutableListOf<String>()
   newList = stringList.map { it.uppercase() }.toMutableList()
   println(newList)

   var even = mutableListOf<Int>()
   var odd = mutableListOf<Int>()


   even = list.filter { it % 2 ==0  }.toMutableList()
   odd = list.filter { it % 2 == 1 }.toMutableList()
   println(even)
   println(odd)

   var start = mutableListOf<String>()
   start = stringList.filter { it.startsWith("J") }.toMutableList()
   println(start)

}



fun main() {
   val emailIdBook = mutableMapOf(
       "email1@gmail.com" to "Name 1",
       "email2@gmail.com" to "Name 2"
   )





   println(emailIdBook.count())


}

fun main(){
    val info = mutableMapOf("Username" to "Password")
    println("Enter the Username ")
    val userName : String = readlnOrNull().toString()

    if (userName in info){
        println("Enter The Password")
        val params : String = readlnOrNull().toString()
        if (info[userName] == params){
            println("Welcome")
        }else{
            println("Incorrect password")
            return
        }
    } else{
        println("No User Name found. Please register")
        Thread.sleep(500)
        println("Enter the Username To Register ")
        val userNames : String = readlnOrNull().toString()
        println("Enter The Password")
        val params : String = readlnOrNull().toString()
        info[userNames] = params
        println("Congrats! You have been registered\nUsername: $userNames\nPassword: $params\nPlease Login")
        return

    }
}
