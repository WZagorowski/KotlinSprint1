package lesson_20

fun main() {
    val bender = Robot("Бендер Жестянкин")

    bender.say()
    bender.say()
    bender.say()
}

private class Robot(val name: String) {

    val listPhrase = mutableListOf(
        "добрый день",
        "спасибо большое",
        "да нет наверное",
        "повторите ваш вопрос",
        "скорее да чем нет"
    )

    val say = { println("$name говорит: ${setModifier()}") }

    private val setModifier = {
        var randomPhrase = listPhrase.random()
        val shufflePhrase: List<String> = randomPhrase.split(" ").toList().shuffled()
        randomPhrase = ""

        for (i in shufflePhrase)
            randomPhrase += " $i"
        randomPhrase.drop(1)
    }
}