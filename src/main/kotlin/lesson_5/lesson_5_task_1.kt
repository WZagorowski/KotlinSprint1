package lesson_5

fun main(){
    val numberOne = (1..50).random()
    val numberTwo = (1..50).random()

    println("Введите результат сложения чисел. $numberOne + $numberTwo =")
    val result = readln().toIntOrNull()

    if (result == null) {
        println("Введен неправильный тип данных")
        throw Exception("Введен неправильный тип данных")
    }
    else {
        if (result == numberOne + numberTwo)
            println("Добро пожаловать!")
        else
            println("Доступ запрещен.")
    }
}