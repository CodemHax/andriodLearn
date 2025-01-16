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

// functions
fun add(a: Int, b : Int) : Int{
    val result :Int = a + b
    return result
}

fun sub(a: Int, b : Int) : Int{
    val result :Int = a - b
    return result
}
fun mul(a: Int, b : Int) : Int{
    val result :Int = a * b
    return result
}

fun div(a: Int, b : Int) : Int{
    val result :Int = a / b
    return result
}

fun main(){
    print("First Value\n")
    val a : Int = readln().toInt()
    print("Second Value\n")
    val b : Int = readln().toInt()
    println("Select the operation\n")
    val operation = readln()

    if (operation == "+"){
        println(add(a,b))
    }
    else if (operation == "-"){
       println(sub(a,b))
    }
    else if (operation == "/"){
        println(div(a,b))
    }
    if (operation == "+"){
        println(mul(a,b))
    }

}




fun main() {
    val petHunger = 50
    val petEnergy = 70
    val petHappiness = 60

    println("Hunger: ${petHunger - 20}")
    println("Energy: ${petEnergy + 40}")
    println("Happiness: ${petHappiness + 30}")
}



fun petHungerFunction(petHunger :Int) : Int {
    return petHunger - 20
}

fun petEnergyFunction(petEnergy :Int) : Int {
    return petEnergy + 40
}

fun petHappinessFunction(petHappiness  :Int) : Int {
    return petHappiness + 30
}

fun displayStatus(petHunger :Int, petEnergy :Int,petHappiness  :Int ){
    println("Hunger: $petHunger")
    println("Energy: $petEnergy")
    println("Happiness: $petHappiness")
}

fun main() {
    val petHunger = 50
    val petEnergy = 70
    val petHappiness = 60

    val petHungerResult = petHungerFunction(petHunger)
    val petEnergyResult = petEnergyFunction(petEnergy)
    val petHappinessResult = petHappinessFunction(petHappiness)

    displayStatus(petHungerResult,petEnergyResult,petHappinessResult)

}

fun main(){
   val list = mutableListOf("Hello", "world","What")
   val random = list.random()
   println(random)
   println(random.startsWith("Hello"))
}

