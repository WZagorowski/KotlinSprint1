package lesson_20

fun main() {
    val bender = Robot("Бендер Жестянкин")

    bender.say.invoke()
    bender.say.invoke()
    bender.say.invoke()
}

private class Robot(val name: String) {

    val listPhrase = mutableListOf(
        "добрый день",
        "спасибо большое",
        "это правильный ответ",
        "повторите ваш вопрос",
        "скорее да чем нет"
    )

    val say = { println("$name говорит: ${setModifier()}") }

    private val setModifier = {
        var randomPhrase = listPhrase.random()
        val reversedPhrase: List<String> = randomPhrase.split(" ").toList().reversed()
        randomPhrase = ""

        reversedPhrase.forEach { randomPhrase += " $it" }
        randomPhrase.drop(1)
    }
}