package lesson_10
fun main() {

    println("Укажите длину вашего случайного пароля:")
    val passwordLength = readln().toInt()
    var password = ""

    for (i in 1..passwordLength)
        password += randomChar()

    println(password)
}
fun randomChar(): Char = "0123456789!\"#\$%&'()*+,-./ ".random()
