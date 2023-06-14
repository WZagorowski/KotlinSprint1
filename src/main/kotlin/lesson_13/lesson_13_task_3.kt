package lesson_13

fun main() {

    val phonebook = Phonebook3 ()

    phonebook.addContact3("Antony", 91192198765, "Vector")
    phonebook.addContact3("Mihael", 91192191234, null)
    phonebook.addContact3("John", 91192198753, null)
    phonebook.addContact3("Jack", 92112198795, "Alpha")
    phonebook.addContact3("Robert", 91192108705, "Omega")
    phonebook.outputAllContacts()
}

private class Phonebook3(val listOfContacts: MutableList<Contact3> = mutableListOf()) {

    fun addContact3(name: String, phoneNumber: Long, company: String?) {
        listOfContacts.add(Contact3(name, phoneNumber, company))
    }

    fun outputAllContacts() {
        listOfContacts.forEach {
            println(
                "Имя: ${it.name} \nНомер: ${it.phoneNumber}\nКомпания: ${it.company ?: "не указано"}\n"
            )
        }
    }

    class Contact3(val name: String, val phoneNumber: Long) {

        var company: String? = null

        constructor(name: String, phoneNumber: Long, company: String?) : this(name, phoneNumber) {

            this.company = company
        }
    }
}