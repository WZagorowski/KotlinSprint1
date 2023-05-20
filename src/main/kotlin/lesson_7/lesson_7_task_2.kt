package lesson_7

fun main() {

    do {
        val codeNumber = (1000..9999).random()
        println("Ваш код авторизации: $codeNumber \nВведите полученный код:")

    } while (readln().toInt() != codeNumber)

    println("Авторизация прошла успешно!")
}