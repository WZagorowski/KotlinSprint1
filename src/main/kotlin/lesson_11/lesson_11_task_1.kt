package lesson_11

fun main() {

    val userOne = User(
        id = 1111,
        login = "Чебурашка",
        password = "1234e",
        email = "cheburator123@gmail.com",
    )

    val userTwo = User(
        id = 1110,
        login = "Крокодил",
        password = "777GENA",
        email = "gennadiy77@krokodile.com",
    )

    println("ID ${userOne.id}")
    println("Login ${userOne.login}")
    println("Password ${userOne.password}")
    println("Email ${userOne.email}")

    println("\nID ${userTwo.id}")
    println("Login ${userTwo.login}")
    println("Password ${userTwo.password}")
    println("Email ${userTwo.email}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
}
