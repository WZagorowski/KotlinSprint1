package lesson_18

fun main() {

    val animal01 = Fox("Lisa")
    val animal02 = Dog("Snoopy")
    val animal03 = Cat("Tom")

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

abstract class Animal {

    abstract val animalName: String
    abstract fun play()
    abstract fun sleep()
    abstract fun eat()
}

private class Fox(override val animalName: String) : Animal() {

    override fun play() = println("Fox $animalName is playing now!")
    override fun sleep() = println("Fox $animalName is sleeping now!")
    override fun eat() = println("Fox $animalName is eating berries now!")
}

private class Dog(override val animalName: String) : Animal() {

    override fun play() = println("Dog $animalName is playing now!")
    override fun sleep() = println("Dog $animalName is sleeping now!")
    override fun eat() = println("Dog $animalName is eating bones now!")
}

private class Cat(override val animalName: String) : Animal() {

    override fun play() = println("Cat $animalName is playing now!")
    override fun sleep() = println("Cat $animalName is sleeping now!")
    override fun eat() = println("Cat $animalName is eating fish now!")
}