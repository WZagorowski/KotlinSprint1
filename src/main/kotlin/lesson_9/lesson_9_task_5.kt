package lesson_9

fun main() {

    val arrayOfIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите $i ингредиент:")
        arrayOfIngredients.add(readln())
    }

    val listOfIngredients = arrayOfIngredients.sorted().toMutableList()

    listOfIngredients[0] = listOfIngredients[0].replaceFirstChar{it.uppercase()}
    listOfIngredients[listOfIngredients.lastIndex] += "."

    println(listOfIngredients)
}