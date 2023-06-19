package lesson_16

fun main() {

    val user16 = User16("Вовочка")
    user16.checkPassword()
}

private class User16(val userName16: String) {

    private val password16 = "qwerty123"

    fun checkPassword() {

        do {
            println("Введите пароль:")
        } while (readln() != password16)
        println("Добро пожаловать, $userName16!")
    }
}