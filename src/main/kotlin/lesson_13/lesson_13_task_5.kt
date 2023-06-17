package lesson_13

fun main() {

    var number5: Long?
    println("Введите телефонный номер:")

    do {
        val strNumber5 = readln()
        number5 = strNumber5.toLongOrNull()

        if (number5 == null)
            println("Ошибка! Неверный формат данных.")

    } while (number5 == null)

    println(number5)
}
