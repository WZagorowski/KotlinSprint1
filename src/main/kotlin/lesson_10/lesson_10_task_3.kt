package lesson_10

fun main() {

    println("Укажите длину вашего случайного пароля:")
    val passwordLength = readln().toInt()
    val password = randomChar(passwordLength)

    println("Ваш пароль готов:\n$password")
}

fun randomChar(passwordLength: Int): String {
    var password = ""

    for (i in 1..passwordLength)
        password += "0123456789!\"#\$%&'()*+,-./ ".random()
    return password
}