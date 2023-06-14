package lesson_13

fun main() {

    val phonebook = Phonebook3()

    phonebook.addContact3("Antony", null, "Vector")
    phonebook.addContact3("Mihael", 91192191234, null)
    phonebook.addContact3(null, 91192198753, null)
    phonebook.addContact3("Jack", 92112198795, "Alpha")
    phonebook.addContact3(null, null, null)
    phonebook.outputAllContacts()
}

private class Phonebook3(val listOfContacts: MutableList<Contact3> = mutableListOf()) {

    fun addContact3(name: String?, phoneNumber: Long?, company: String?) {
        listOfContacts.add(Contact3(name, phoneNumber, company))
    }

    fun outputAllContacts() {
        listOfContacts.forEach {
            println(
                """
                    
                Имя: ${it.name ?: "не указано"} 
                Номер: ${it.phoneNumber ?: "не указано"}
                Компания: ${it.company ?: "не указано"}
                """.trimIndent()
            )
        }
    }

    class Contact3(val name: String?, val phoneNumber: Long?, val company: String?)
}