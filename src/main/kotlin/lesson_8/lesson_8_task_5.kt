package lesson_8

fun main() {

    println("Введите количество ингредиентов в списке:")

    val quantity = readln().toInt()
    val arrayOfIngredients = Array(quantity, {" "})

    for (i in 1..quantity) {
        println("Введите ингредиент №$i:")
        val ingredient = readln()
        arrayOfIngredients[i-1] = ingredient
    }

    for (i in arrayOfIngredients)
        println(i)
}