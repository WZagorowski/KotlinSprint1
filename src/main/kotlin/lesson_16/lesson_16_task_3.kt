package lesson_16

fun main() {

    val user16 = User16("Вовочка")
    user16.checkPassword()
}

private class User16(val userName16: String) {

    private var password16 = ""

    init {
        println("Для завершения регистрации установите пароль:")
        password16 = readln()
        println("Пароль для пользователя $userName16 успешно сохранен.")
    }

    fun checkPassword() {

        do {
            println("Для входа введите ваш пароль:")
        } while (readln() != password16)
        println("Добро пожаловать, $userName16!")
    }
}