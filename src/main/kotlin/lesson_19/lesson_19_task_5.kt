package lesson_19

fun main() {

    val register = NameRegister()
    register.addFiveEntry()
}

enum class Gender(val translation: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

private class NameRegister {

    init {
        println(
            """
            Инструкция заполнения картотеки:
            - карточки заполняются поочередно,
            - сначала вводится имя, затем через "Enter" пол (м/ж),
            - после ввода 5 человек список карточек выводится на экран.
            
            """.trimIndent()
        )
    }

    val listOfAllNames: MutableList<Init> = mutableListOf()

    fun addFiveEntry() {
        for (i in 1..5) {
            println("Заполните $i запись из 5 в картотеку.\nВведите имя:")
            val newName = readln()
            var input = ""

            do {
                println("Введите пол (м - мужской, ж - женский):")
                input = readln()
            } while (input != "м" && input != "ж")

            val newGender = if (input == "м") Gender.MALE else Gender.FEMALE

            listOfAllNames.add(Init(newName, newGender))
        }
        listOfAllNames.forEach { println("Имя: ${it.name}, пол: ${it.gender.translation}.") }
    }
}

private class Init(val name: String, val gender: Gender)