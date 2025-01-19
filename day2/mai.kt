fun main(){

    println(add(10,5))
    println(sub(10,5))
    println(div(10,5))
    println(mul(10,5))
    addSub(subAdd, 10)

}
val add: (Int, Int) -> Int = {a,b -> a + b }
val sub: (Int, Int) -> Int = {a,b -> a - b }
val div: (Int, Int) -> Int = {a,b -> a / b }
val mul: (Int, Int) -> Int = {a,b -> a * b }
val subAdd:(String) -> String ={ s: String -> "I am $s" }


fun addSub(subAdd: (String) -> String, b :Int ) {
  println(subAdd("God"))
    return println(b)
}


var funcs : (Int, String) -> Unit ={ a, b -> println("HO $a , $b") }

fun main(){
    funcs(10, "Hello")
    funcs(20, "World")
    funcs(30, "Kotlin")
}

fun main(){
     var score = mapOf("test" to 100,"test2" to 200,"test3" to 300)
     var update =  score.map { (name,score) -> "$name score ${score + 5}"  }
     println(update)

}

fun main() {
     val studentScores = mapOf("Alice" to 85, "Bob" to 78, "Charlie" to 92)
     val updatedScores = studentScores.map { (name, score) -> "$name scored ${score + 5}" }
     println(updatedScores)
}

 Convert a list of integers to their squares.
fun main(){
    val num = mutableListOf(10,15,20)
     val sqauare = num.map { it * it }
    println(sqauare)
}

Transform a list of strings to uppercase.

fun main(){
     val strings = listOf("hello", "world", "kotlin")
     val upper = strings.map { "Length of $it is ${it.length}" }
     println(upper)
}

data class Score(val name: String, val score: Int, val age : Int = 18)

fun maind(){
    var score = listOf(
        Score("Hakim", 100, 18),
        Score("Irfan", 10, 25),
        Score("Avej",  13,23),
        Score("Sarah", 85,13),
        Score("Tom", 60,12),
        Score("Alice", 92,43),
        Score("Bob", 55),
        Score("Charlie", 72),
        Score("David", 47),
        Score("Emily", 88),
        Score("Frank", 30),
        Score("Grace", 79),
        Score("Hank", 53),
        Score("Ivy", 95),
        Score("Jack", 67),
        Score("Kathy", 41),
        Score("Leo", 100),
        Score("Mona", 28),
        Score("Nate", 76),
        Score("Oscar", 39)
    )
    val update = score.groupBy { it.score % 2 == 0 }
    println(" Even" + update[true]?.map { it.name })
    println(" Odd " + update[false]?.map { it.name })
}


data class Book(val name: String, val price: Double, val genre: String)

fun books() {
    val books = listOf(
        Book("The Catcher in the Rye", 10.99, "Fiction"),
        Book("To Kill a Mockingbird", 12.99, "Fiction"),
        Book("1984", 15.99, "Dystopian"),
        Book("Pride and Prejudice", 9.99, "Romance"),
        Book("The Great Gatsby", 14.99, "Fiction"),
        Book("Moby Dick", 11.99, "Adventure"),
        Book("War and Peace", 19.99, "Historical"),
        Book("The Odyssey", 13.99, "Epic"),
        Book("Crime and Punishment", 14.99, "Psychological"),
        Book("The Brothers Karamazov", 16.99, "Philosophical"),
        Book("Brave New World", 12.99, "Dystopian"),
        Book("The Hobbit", 10.99, "Fantasy"),
        Book("Fahrenheit 451", 11.99, "Dystopian"),
        Book("Jane Eyre", 9.99, "Romance"),
        Book("Wuthering Heights", 10.99, "Romance"),
        Book("The Divine Comedy", 17.99, "Epic"),
        Book("The Iliad", 13.99, "Epic"),
        Book("Les Misérables", 18.99, "Historical"),
        Book("Don Quixote", 15.99, "Adventure"),
        Book("The Catch-22", 14.99, "Satire"),
        Book("The Three Musketeers", 12.99, "Action"),
        Book("Gone with the Wind", 14.99, "Romance"),
        Book("The Book Thief", 13.99, "Historical")
    )

    val group = books.groupBy { it.genre == "Fiction" }
    val name = group[true]?.map { it.name }
    val r = name?.sortedBy { it.replace("The"," ") }
    println(r)
    println(r?.sortedBy { it })
    name?.forEachIndexed(){index, s ->   println("$index")  }
    val price = group[true]?.map { it.price }
    println(price?.any{ it > 10 })

    var sum  = 0.0

    if (price != null) {
        for(i in price){
            sum += i
        }
    }
    println("Total Sum $sum")

}
fun odd() {
    val odd = (1..600).toList()
    val todolist = odd.filter { it % 2 == 1 }
    println(todolist)
}





fun main(){
    books()
}
