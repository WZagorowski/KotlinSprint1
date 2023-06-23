package lesson_17

fun main() {

    val user17 = User17(userName = "Neo", password = "qwerty1")

    user17.userName = "Morfius"
    println(user17.userName)
    println()
    user17.password = "5xyz"
    println(user17.password)
}

private class User17(userName: String, password: String) {

    var userName = userName
        set(value) {
            field = value
            println("Логин успешно изменен!")
        }

    var password = password
        get() {
            var result = ""

            for (i in field)
                result += "*"

            return "Пароль: $result"
        }
        set(value) = println("Вы не можете изменить пароль!")
}