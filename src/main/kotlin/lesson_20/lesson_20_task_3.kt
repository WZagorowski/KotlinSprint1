package lesson_20

fun main() {
    val player20 = Player(name = "Валера", isPlayerHaveKey = false)
    val player21 = Player(name = "Женя", isPlayerHaveKey = true)

    player20.tryOpenDoor()
    player21.tryOpenDoor()
}

private class Player(
    val name: String,
    var isPlayerHaveKey: Boolean,
) {

    val tryOpenDoor = {
        println("Игрок $name пытается открыть запертую дверь...")
        checkHavingKey()
    }

    private val checkHavingKey = {
        if (isPlayerHaveKey) {
            println("У игрока $name оказался необходимый ключик и дверь отворилась.")
            isPlayerHaveKey = false
        } else
            println("Игрок $name не может открыть дверь. Необходим ключик!")
    }
}