package lesson_19

fun main() {

    val ship1 = Spaceship("Apollon")

    ship1.takeOff()
    ship1.land()
    ship1.shoot()
}

private class Spaceship(val name: String) {

    fun takeOff() {}
    // TODO need more information about logic here

    fun land() {
        TODO()
    }

    fun shoot() {}
}