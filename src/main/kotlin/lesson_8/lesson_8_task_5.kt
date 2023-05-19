package lesson_8

fun main() {

    println("Введите количество ингредиентов в списке:")

    val arrayOfIngredients = Array(readln().toInt(), {" "})

    for (i in arrayOfIngredients.indices) {

        println("Введите ингредиент №${i+1}:")
        arrayOfIngredients[i] = readln()
    }
    println("Готово! Вы создали следующий список ингредиентов:")

    for (i in arrayOfIngredients)
        println(i)
}