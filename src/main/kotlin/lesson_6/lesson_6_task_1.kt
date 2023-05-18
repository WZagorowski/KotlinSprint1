package lesson_6

fun main() {

    println("Регистрация нового пользователя. Введите Ваш:\n - Логин \n - Пароль")
    val userName = readln()
    val userPassword = readln()
    println("Регистрация прошла успешно!")

    do {
        println("Чтобы войти в приложение введите Ваш:\n - Логин \n - Пароль")
        val isUserNameTrue = (readln() == userName)
        val isUserPasswordTrue = (readln() == userPassword)

    } while (!isUserNameTrue || !isUserPasswordTrue)

    println("Авторизация прошла успешно!")
}