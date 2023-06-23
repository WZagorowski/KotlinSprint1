package lesson_18

fun main() {

    val animal01 = Fox("Lisa", "berries")
    val animal02 = Dog("Snoopy", "bones")
    val animal03 = Cat("Tom", "fish")

    val listAllAnimal = listOf(animal01, animal02, animal03)
    printAllActivities(listAllAnimal)
}

fun printAllActivities(listAnimal: List<Animal>) {
    listAnimal.forEach {
        it.play()
        it.sleep()
        it.eat()
    }
}

abstract class Animal(private val animalName: String, private val animalFood: String) {

    fun play() = println("$animalName is playing now!")

    fun sleep() = println("$animalName is sleeping now!")

    fun eat() = println("$animalName is eating $animalFood now!")
}

private class Fox(animalName: String, animalFood: String) : Animal(animalName, animalFood)

private class Dog(animalName: String, animalFood: String) : Animal(animalName, animalFood)

private class Cat(animalName: String, animalFood: String) : Animal(animalName, animalFood)