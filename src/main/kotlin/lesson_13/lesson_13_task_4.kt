package lesson_13

fun main() {

    val phonebook4 = Phonebook4()

    phonebook4.addContact4()
    phonebook4.outputAllContacts()
}

private class Phonebook4(val listOfContacts: MutableList<Contact4> = mutableListOf()) {

    fun addContact4() {

        do {
            println("Введите имя пользователя:")
            var name = readlnOrNull()

            if (name?.isBlank() == true)
                name = null

            println("Введите телефонный номер:")
            var phoneNumber: Long?

            do {
                val input = readlnOrNull()
                phoneNumber = input?.toLongOrNull()

                if (phoneNumber == null)
                    println("Ошибка! Неверный формат данных.")

            } while (phoneNumber == null)

            println("Введите название компании:")
            var company = readlnOrNull()

            if (company?.isBlank() == true)
                company = null

            if (name != null || company != null) {
                listOfContacts.add(Contact4(name, phoneNumber, company))
            } else
                println("Ошибка! Не указан телефонный номер либо все другие поля пустые.")

            println("Если хотите добавить новую запись, введите \"yes\"")

        } while (readln() == "yes")
    }

    fun outputAllContacts() {

        listOfContacts.forEach {
            println(
                "Имя: ${it.name ?: "не указано"}. Тел. номер: ${it.phoneNumber ?: "не указано"}." +
                        " Компания: ${it.company ?: "не указано"}."
            )
        }
    }

    class Contact4(val name: String?, val phoneNumber: Long?, val company: String?)
}