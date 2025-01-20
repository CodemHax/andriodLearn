// class

open class Vehicle(val name : String){
   open fun commonFeatures(){
       println("I am Traveling in a $name")
   }
}

class Bike(name: String) : Vehicle(name){

   fun specficMethod(){
       println("$name have two wheels")
   }

}

class CarWithoutSunRoof(name: String) : Vehicle(name){

   fun specficMethod(){
       println("$name have four wheels")
   }

}
class CarWithSunRoof(name: String) : Vehicle(name){

   fun specficMethod(){
       println("$name have four wheels")
   }

   override fun commonFeatures(){
       super.commonFeatures()
       println("I Drive $name with SunRoof")
   }

}


fun main(){
//    val bike = Bike("passion Pro")
//    val car = Car("G Wagon")
//    bike.commonFeatures()
//    bike.specficMethod()
//    println("Car")
//    car.specficMethod()
//    car.commonFeatures()
   val carsunroof = CarWithSunRoof("Audi A8")
   carsunroof.commonFeatures()
   carsunroof.specficMethod()

}




,

// data class
data class Info(val name : String, val age : Int , val height : Double ,val weight : Double)

fun main() {

   val info = Info("Alex", 22, 178.00, 87.00)
   println(" ${info.age} + ${info.height} + ${info.weight} + ${info.name}" )
   println(info)
}

// interface
interface Shape{

   fun calculateArea(length:Int,breath :Int) : Int


}

class Rectangle : Shape{
   override fun calculateArea(length: Int, breath: Int): Int {
       return length * breath
   }
}


fun main() {
   val rectangle = Rectangle()
   val area =rectangle.calculateArea(14,13).also {
       println(it)
   }
}
