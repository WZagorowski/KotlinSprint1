package lesson_16

fun main() {
    val user16 = User16("Вовочка", "123йцуке")

    user16.checkPassword()
}

private class User16(val userName: String, private var password: String) {

    fun checkPassword() {
        do println("Для входа введите ваш пароль:")
        while (readln() != password)

        println("Добро пожаловать, $userName!")
    }
}