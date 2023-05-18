package lesson_8

fun main() {
    println("Сюда приходит количество просмотров за неделю по дням:")

    val viewsPerWeek = intArrayOf(11, 0, 39, 42, 31, 105, 48)
    var result = 0

    for (i in viewsPerWeek) {
        result += i
    }

    println("Количество просмотров за неделю: $result")
}