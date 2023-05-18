package lesson_7

fun main() {

    println("Укажите длину вашего случайного пароля:")

    val passwordLength = readln().toInt()
    var password = ""

    for (i in 1..passwordLength) {

        val range1 = (0..9).random()
        val range2 = ('a'..'z').random()
        val range3 = ('A'..'Z').random()
        val randomResult = arrayOf(range1, range2, range3).random()

        password += randomResult
    }

    println(password)
}