package lesson_19

fun main() {

    val register = PersonsRegister()
    register.addFivePersons()
}

enum class Gender(val translation: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

private class PersonsRegister {

    val listOfAllPersons: MutableList<Person> = mutableListOf()
    
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

    fun addFivePersons() {
        for (i in 1..5) {
            println("Заполните $i запись из 5 в картотеку.\nВведите имя:")
            val newName = readln()

            listOfAllPersons.add(Person(newName, getGenderField()))
        }
        listOfAllPersons.forEach { println("Имя: ${it.name}, пол: ${it.gender.translation}.") }
    }
}

private class Person(val name: String, val gender: Gender)

fun getGenderField(): Gender {
    var input: String

    do {
        println("Введите пол (м - мужской, ж - женский):")
        input = readln()
    } while (input != "м" && input != "ж")

    return if (input == "м")
        Gender.MALE
    else
        Gender.FEMALE
}