package lesson_11

fun main() {

    val userOne = User(
        id = 1111,
        login = "Чебурашка",
        password = "1234e",
        email = "cheburator@gmail.com",
    )

    val userTwo = User(
        id = 1110,
        login = "Крокодил",
        password = "777GENA",
        email = "gennadiy@krokodile.com"
    )

    println(userOne.id)
    println(userOne.login)
    println(userOne.email)

    println("\n${userTwo.id}")
    println(userTwo.login)
    println(userTwo.email)
}