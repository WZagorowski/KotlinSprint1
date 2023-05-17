package lesson_6
fun main() {

    println("Это приложение - таймер. Укажите количество секунд:")
    var counter = readln().toInt()

    while (counter > 0) {
        println("Осталось ${counter--} секунд")
        Thread.sleep(1000)
    }

    println("Время вышло")
}