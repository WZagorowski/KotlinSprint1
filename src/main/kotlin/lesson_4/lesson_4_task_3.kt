package lesson_4

fun main(){
    val isWeatherSunny = "Sunny"
    val isTentOpen = "Open"
    val isHumidityCorrect = 20
    val isItNotWinter = "Winter"

    val result = isWeatherSunny == "Sunny" && isTentOpen == "Open"
            && isHumidityCorrect == 20 && isItNotWinter != "Winter"
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}