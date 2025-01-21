enum class Weather {
    SUNNY, RAINY, CLOUDY, SNOWY
}



fun weather(){
    val WeatherCondtion : Weather = Weather.SNOWY

    when(WeatherCondtion){

        Weather.SUNNY -> println("Weather is Sunny")
        Weather.RAINY -> println("Weather is Rainy")
        Weather.CLOUDY -> println("Weather is Cloudy")
        Weather.SNOWY -> println("Weather is Snowy")
    }
}

fun range(){
    val GivenNumber = 30
    when(GivenNumber){
        in 1..10 -> println(" Below 10")
        in 11..20 -> println(" Below 20")
        in 21..30 -> println(" Below 30")
        in 31..40 -> println(" Below 40")
        in 41..50 -> println(" Below 50")
        else -> println("Above 50")
    }
}



fun weathers(){
    val WeatherCondtion : Weather = Weather.CLOUDY

    val result = if (WeatherCondtion == Weather.SNOWY) "Snow"
                 else if (WeatherCondtion == Weather.SUNNY) "Sunny"
                 else "IDK"
    println(result)
}

fun weatherss(){
    val WeatherCondtion : Weather = Weather.RAINY
    val result = when(WeatherCondtion){
        Weather.SUNNY -> "Weather is Sunny"
        Weather.RAINY -> "Weather is Rainy"
        Weather.CLOUDY -> "Weather is Cloudy"
        Weather.SNOWY -> "Weather is Snowy"
    }

    println(result)

}
fun main(){
     weatherss()
}
