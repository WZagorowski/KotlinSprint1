package lesson_13

fun main() {
    val contact13 = PhoneContact2(
        "Antony",
        8911911555666,
        null,
    )

    contact13.outputPhoneContact()
}

class PhoneContact2(private val name: String, private val phoneNumber: Long) {

    private var company: String? = null

    constructor(name: String, phoneNumber: Long, company: String?) : this(name, phoneNumber) {

        this.company = company
    }

    fun outputPhoneContact() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "не указано"}")
    }
}