package lesson_11

fun main() {

    val contact1 = Contact(
        "Vanya",
        "Vanya.jpeg",
        "Ivan",
        "Ivanov",
        "8(999) 999-42-42",
        "8(999) 888-42-42",
        "ivanivanov@imail.pl",
    )

    val contact2 = Contact(
        "Wife",
        "Wife.jpeg",
        "Julia",
        "Petrova",
        "8(999) 111-41-41",
        "8(999) 111-41-41",
        "julia55@imail.pl",
    )

    val contact3 = Contact(
        "Mom",
        "Mom.jpeg",
        "Natalia",
        "Petrova",
        "8(999) 111-44-45",
        "8(999) 111-77-45",
        "nataliapetrova@imail.pl",
    )

    val contact4 = Contact(
        "Dad",
        "Dad.jpeg",
        "Viktor",
        "Petrov",
        "8(999) 111-22-23",
        "8(999) 111-77-45",
        "viktorpetrov@imail.pl",
    )

    contact1.addToFavourite(contact2)
    contact1.addToFavourite(contact3)
    contact1.addToFavourite(contact4)
    contact1.showContact()

}

private class Contact(
    val name: String,
    val avatar: String,
    val firstName: String,
    val lastName: String,
    val mobileNumber: String,
    val homeNumber: String,
    val email: String,
    val favouriteContacts: MutableList<String> = mutableListOf()
    ) {

    fun writeSMS(mobileNumber: String) {
        println("SMS сообщение отправлено на номер: $mobileNumber")
    }

    fun phoneCall(mobileNumber: String) {
        println("Вызов: $mobileNumber")
    }

    fun videoCall(mobileNumber: String) {
        println("Видео вызов: $mobileNumber")
    }

    fun writeEmail(email: String) {
        println("Email отправлен на адрес: $email")
    }

    fun videoCallInApp(mobileNumber: String) {
        println("Открыть приложение FaceTime. Совершить видео вызов на номер: $mobileNumber")
    }

    fun phoneCallInApp(mobileNumber: String) {
        println("Открыть приложение FaceTime. Совершить аудио вызов на номер: $mobileNumber")
    }

    fun addToFavourite(contact: Contact) {
        favouriteContacts.add(contact.name)
        println("Контакт ${contact.name} добавлен в избранное")

    }

    fun showContact(){
        println("\n$name\n$avatar\n$firstName$lastName\n$mobileNumber\n$homeNumber\n$email")
        println("Избранные контакты: $favouriteContacts")
    }
}