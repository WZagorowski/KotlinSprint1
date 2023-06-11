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

    val contact2 = Contact.FavouriteContact(
        "Wife",
        "8(999) 111-41-41"
    )

    val contact3 = Contact.FavouriteContact(
        "Mom",
        "8(999) 111-44-45",
    )

    val contact4 = Contact.FavouriteContact(
        "Dad",
        "8(999) 111-22-23",
    )

    contact1.addToFavourites(contact2)
    contact1.addToFavourites(contact3)
    contact1.addToFavourites(contact4)
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
    val favouritesList: MutableList<FavouriteContact> = mutableListOf()
    ) {

    class FavouriteContact(
        val name: String,
        val mobileNumber: String,
        )

    fun addToFavourites(contact: FavouriteContact) {
        favouritesList.add(contact)
    }

    fun showContact() {
        println("$name\n$avatar\n$firstName $lastName\n$mobileNumber\n$homeNumber\n$email")

        if (favouritesList.isNotEmpty()) {
            println("\nИзбранные контакты:")
            favouritesList.forEach { println ("${it.name}\n${it.mobileNumber}") }
        }
    }
}