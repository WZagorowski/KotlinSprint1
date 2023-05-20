package lesson_7

fun main() {

    println("Укажите длину вашего случайного пароля:")

    val passwordLength = readln().toInt()
    var password = ""
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    for (i in 1..passwordLength) {
        password += chars.random()
    }
    println(password)
}