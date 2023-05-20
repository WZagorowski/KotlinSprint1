package lesson_8

fun main() {

    println("Введите количество ингредиентов в списке:")
    val quantity = readln().toInt()

    println("Введите ингредиенты, каждый с новой строки:")
    val arrayOfIngredients = Array(quantity) { readln() }

    println("Готово! Вы создали следующий список ингредиентов:")
    for (i in arrayOfIngredients)
        println(i)
}