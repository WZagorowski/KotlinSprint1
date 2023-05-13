package lesson_5

fun main(){
    val numberOne = 7
    val numberTwo = 8
    println("Введите результат сложения чисел. $numberOne + $numberTwo =")
    val result = readln().toIntOrNull()
    if (result == null) println("Введен неправильный тип данных")
    else {
        if (result == numberOne + numberTwo)
            println("Добро пожаловать!")
        else
            println("Доступ запрещен.")
    }
}