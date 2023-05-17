package lesson_6

fun main() {

    println("Это приложение - таймер. Укажите количество секунд:")
    val timeBeforeStop = readln().toInt()
    var counter = timeBeforeStop

    while (counter > 0) {
        Thread.sleep(1000)
        counter--
    }

    println("Прошло $timeBeforeStop секунд.")
}