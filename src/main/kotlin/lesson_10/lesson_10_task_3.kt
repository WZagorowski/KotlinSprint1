package lesson_10

fun main() {

    println("Укажите длину вашего случайного пароля:")
    val passwordLength = readln().toInt()

    val password = getRandomPassword(passwordLength)

    println("Ваш пароль готов:\n$password")
}

fun getRandomPassword(passwordLength: Int): String {

    var password = ""

        for (i in 1..passwordLength) {

            password += if (i % 2 == 1)
                (32..47).random().toChar()
            else
                ('0'..'9').random()
        }

    return password
}