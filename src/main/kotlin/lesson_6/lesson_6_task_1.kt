package lesson_6

import kotlin.system.exitProcess
fun main() {

    while (true) {

        println("Регистрация нового пользователя.\nВведите ваш логин:")
        val userName = readln()

        if (userName.isBlank())
            println("Ошибка. Попробуйте снова.")
        else {
            println("Введите пароль:")
            val userPassword = readln()

            if (userPassword.isBlank())
                println("Ошибка. Попробуйте снова.")
            else {
                println("Регистрация прошла успешно!")

                while (true) {
                    println("Чтобы войти в приложение введите ваш логин.")

                    if (readln() != userName)
                        println("Ошибка.")
                    else {
                        println("Авторизация пользователя $userName.\nВведите пароль:")

                        if (readln() != userPassword)
                            println("Ошибка.")
                        else {
                            println("Авторизация прошла успешно!")
                            exitProcess(1)
                        }
                    }
                }
            }
        }
    }
}