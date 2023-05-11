package lesson_4

fun main(){
    val weather = "солнечная погода"
    val tent = "тент раскрыт"
    val humidity = "влажность 20"
    val timeOfYear = "время года зима"
    val result = weather == "солнечная погода" && tent == "тент раскрыт" && humidity == "влажность 20" && timeOfYear != "время года зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}