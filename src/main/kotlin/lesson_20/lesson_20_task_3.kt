package lesson_20

fun main() {
    val player20 = Player(name = "Валера", isPlayerHaveKey = false)
    val player21 = Player(name = "Женя", isPlayerHaveKey = true)

    val checkHavingKey = { it: Player ->
        if (it.isPlayerHaveKey) {
            println("Игрок ${it.name} торжественно открыл дверь.")
            it.isPlayerHaveKey = false
        } else
            println("Игрок ${it.name} не может открыть дверь. Необходим ключик!")
    }

    checkHavingKey(player20)
    checkHavingKey(player21)
    checkHavingKey(player21)
}

private class Player(
    val name: String,
    var isPlayerHaveKey: Boolean,
)