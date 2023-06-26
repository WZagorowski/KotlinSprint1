package lesson_20

fun main() {
    val player20 = Player(name = "Валера", currentHealth = 25)

    val getHealingPotion = { it: Player ->
        it.currentHealth = it.maxHealth
        println("Игрок ${player20.name} применил лечебное зелье.")
    }

    getHealingPotion(player20)

    println("Текущее здоровье игрока ${player20.name}: ${player20.currentHealth} ед.")
}

private class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100,
)