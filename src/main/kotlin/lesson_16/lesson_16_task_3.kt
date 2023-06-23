package lesson_16

fun main() {
    val user16 = UserData(userName = "Вовочка", password = "123йцуке")

    do println("Для входа введите ваш пароль:")
    while (!user16.checkPassword(readln()))

    println("Добро пожаловать, ${user16.userName}!")
}

private class UserData(val userName: String, private var password: String) {

    fun checkPassword(enteredPassword: String) = (enteredPassword == password)
}