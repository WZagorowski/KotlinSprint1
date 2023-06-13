package lesson_13

fun main() {
    val contact13 = PhoneContact(
        "Antony",
        8911911555666,
        null,
    )

    contact13.outputPhoneContact()
}

private class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
    ) {

    fun outputPhoneContact() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company?: "не указано"}")
    }
}