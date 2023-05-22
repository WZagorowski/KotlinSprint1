package lesson_9

fun main() {

    val arrayOfIngredients = mutableSetOf<String>()
    val listOfIngredients = mutableListOf<String>()

    println("Введите 5 ингредиентов, каждый с новой строки:")

    for (i in 1..5) {
        arrayOfIngredients.add(readln())
    }

    arrayOfIngredients.forEach() { it ->
        listOfIngredients.add(it)
    }

    listOfIngredients.sort()

    listOfIngredients[0] = listOfIngredients[0].replaceFirstChar{it.uppercase()}
    listOfIngredients[listOfIngredients.lastIndex] += "."

    println(listOfIngredients)
}