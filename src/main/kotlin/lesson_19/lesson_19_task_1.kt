package lesson_19

fun main() {

    println("Список рыбок, доступных для добавления в аквариум:")
    Fish.values().forEach { println(it.fishName) }
}

enum class Fish(val fishName : String) {

    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");
}