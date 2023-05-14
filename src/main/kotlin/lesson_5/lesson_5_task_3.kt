package lesson_5
fun main(){
    println("""
    |Лотерея! Угадай оба числа и выйграй АВТОМОБИЛЬ!
    |Введи два числа от 1 до 100 (через пробел в порядке возврастания)""".trimMargin())

    val userNumbers = readln().split(" ")
    val numberOne = userNumbers[0].toInt()
    val numberTwo = userNumbers[1].toInt()

    val result =
        if (numberOne == FIRST_WIN && numberTwo == SECOND_WIN)
            "Поздравляем! Вы выиграли главный приз!"
        else if (numberOne == FIRST_WIN || numberTwo == SECOND_WIN || numberOne == SECOND_WIN
            || numberTwo == FIRST_WIN)
            "Вы выиграли утешительный приз!"
        else
            "Неудача! Крутите барабан!"

    println(result)
    println("Числа, необходимые для победы: $FIRST_WIN $SECOND_WIN")
}

const val FIRST_WIN = 5
const val SECOND_WIN = 25