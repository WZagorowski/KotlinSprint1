package lesson_13

fun main() {

    var number5: Long = 0
    println("Введите телефонный номер:")

    try {
        number5 = readln().toLong()
        println("Номер сохранен в базе.")
    } catch (e: NumberFormatException) {
        println("Ошибка! Неверный формат данных.")
    }

    println(number5)
}