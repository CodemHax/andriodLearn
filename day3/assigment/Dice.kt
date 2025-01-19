class DiceRun(private val name: String){

    fun welcome(){
        println("Welcome $name to DiceRun")
    }

    fun rollDice(){
        val random = (1..6).random()
        println("Rolling The Dice...")
        Thread.sleep(10000)
        println("$name Got Number $random On Dice")
    }
    fun ThankYou(){
        println("$name Thank you for playing game")
    }

}

fun main(){
    println("Please Enter Your Name: ")
    val name : String = readlnOrNull().toString()
    val dice = DiceRun(name)
    dice.welcome()
    dice.rollDice()
    dice.ThankYou()
}
