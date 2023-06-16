package lesson_14

fun main() {

    val ship1 = StandardShip2("Kraken", 15, 200)
    ship1.printSpeed()
    ship1.printCapacity()

    val ship2 = Freighter("Bull", 10, 500, 45)
    println()
    ship2.printSpeed()
    ship2.printCapacity()

    val ship3 = Icebreaker("Wolf", 12, 80, 24.5, false)
    println()
    ship3.printSpeed()
    ship3.printCapacity()
    ship3.breakTheIce()
}

open class StandardShip2(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {

    fun printSpeed() {
        println("Скорость корабля $name составляет: $speed узлов.")
    }

    fun printCapacity() {
        println("Вместимость корабля $name составляет: $capacity контейнеров.")
    }
}

class Freighter(
    name: String,
    speed: Int,
    capacity: Int,
    val maxWeight: Int,
) : StandardShip2(name, speed, capacity)

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
    val power: Double,
    val isAtomic: Boolean,
) : StandardShip2(name, speed, capacity) {

    fun breakTheIce() {
        println("Ледокол $name расчищает морской путь от льда.")
    }

}