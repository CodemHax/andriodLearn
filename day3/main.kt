class Cake(
    var flavour : String ,
    var quantity : Int
){
    init {
        println("primary used")
    }
    constructor(flavour: String) : this(flavour, 0){
        println("Using Secondary used")
    }


 }

 fun main(){
     val vanillaCake = Cake(flavour = "vanilla", quantity = 9)
 }
