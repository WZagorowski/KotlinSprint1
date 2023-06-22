package lesson_17

fun main() {

    val newShip1 = Ship17("Fast", 5.75, "Gdansk")

    newShip1.name = "Slow"
    println(newShip1.name)
}

class Ship17(name: String, var speed: Double, var shipPort: String) {

    var name = name
        set(value) = println("Имя корабля менять нельзя!")
}