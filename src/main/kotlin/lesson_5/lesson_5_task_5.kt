package lesson_5
fun main(){
    val winOne = (1..100).random()
    val winTwo = (1..100).random()
//    println("$first $second")

    println("""
    |Лотерея! Угадай оба числа и выйграй АВТОМОБИЛЬ!
    |Введи два числа от 1 до 100 (через пробел)""".trimMargin())
    val userNumbers = readln().split(" ")
    val numberOne = userNumbers[0].toInt()
    val numberTwo = userNumbers[1].toInt()
    val result =
        if (numberOne == winOne && numberTwo == winTwo || numberOne == winTwo && numberTwo == winOne)
            "Поздравляем! Вы выиграли главный приз!"
        else if (numberOne == winOne || numberTwo == winTwo || numberOne == winTwo || numberTwo == winOne)
            "Вы выиграли утешительный приз!"
        else
            "Неудача! Крутите барабан!"
    println(result)
    println("Числа, необходимые для победы: $winOne $winTwo")
}