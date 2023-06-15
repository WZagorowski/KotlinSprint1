package lesson_14

fun main() {

    val ship1 = StandardShip1("Kraken", 15, 200)
    ship1.printSpeed()
    ship1.printCapacity()
}

class StandardShip1(private val name: String, private val speed: Int, private val capacity: Int) {

    fun printSpeed() {
        println("Скорость корабля $name составляет: $speed узлов")
    }

    fun printCapacity() {
        println("Вместимость корабля $name составляет: $capacity контейнеров")
    }
}