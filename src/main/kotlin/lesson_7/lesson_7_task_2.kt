package lesson_7

fun main() {

    do {
        val range = (1000..9999).random()
        println("Ваш код авторизации: $range \nВведите полученный код:")

    } while (readln().toInt() != range)

    println("Авторизация прошла успешно!")
}