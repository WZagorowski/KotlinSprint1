package lesson_9

fun main() {
    println("Введите пять ингридиентов блюда через запятую:")
    val ingredients = readln().split(", ").sorted()

    println("Готово! Список отсортирован по алфавиту: $ingredients")
}