package lesson_7

fun main() {

    do {
        val range1 = (1..9).random()
        val range2 = (0..9).random()
        val range3 = (0..9).random()
        val range4 = (0..9).random()

        val yourCodeIs = ("$range1$range2$range3$range4")

        println("Ваш код авторизации: $yourCodeIs \nВведите полученный код:")

    } while (readln() != yourCodeIs)

    println("Авторизация прошла успешно!")
}