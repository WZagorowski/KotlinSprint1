package lesson_6

fun main() {
    println("Угадайте число в промежутке от 1 до 9 за 5 попыток")

    val winningNumber = (1..9).random()

    var counter = 5

    while (counter > 0) {
        counter--
        println("Введите число")

        if (readln().toInt() == winningNumber) {
            println("Это была великолепная игра!")
            break
        }
        else if (counter > 0)
            println("Не угадал! Осталось $counter попыток")
        else
            println("Вы проиграли. Было загадано число $winningNumber")
    }
}
