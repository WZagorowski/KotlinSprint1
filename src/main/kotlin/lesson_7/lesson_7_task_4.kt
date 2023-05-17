package lesson_7

fun main() {

    println("Это приложение - таймер. Укажите количество секунд:")
    val yourTime = readln().toInt()
    val yourTimeToZero = yourTime downTo 0

    for (second in yourTimeToZero) {
        println("Осталось секунд: $second")
        Thread.sleep(1000)
    }

    println("Время вышло")
}