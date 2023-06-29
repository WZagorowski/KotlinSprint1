package lesson_20

fun main() {
    val player20 = Player(name = "Валера", currentHealth = 25)

    player20.getHealingPotion()
    player20.getHealthInfo()
}

private class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100,
) {

    val getHealingPotion = {
        currentHealth = maxHealth
        println("Игрок $name применил лечебное зелье.")
    }

    val getHealthInfo = { println("Текущее здоровье игрока $name: $currentHealth ед.") }
}