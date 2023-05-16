package lesson_4

fun main(){
    val isWeatherSunny = true
    val isTentOpen = true
    val isHumidityCorrect = true
    val isItNotWinter = false

    val result = isWeatherSunny && isTentOpen && isHumidityCorrect && isItNotWinter
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}