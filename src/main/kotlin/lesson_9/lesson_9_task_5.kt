package lesson_9

fun main() {

    println("Введите 5 ингредиентов, каждый с новой строки:")

    val arrayOfIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        arrayOfIngredients.add(readln())
    }

    val listOfIngredients = (arrayOfIngredients.toList() as MutableList<String>)
    listOfIngredients.sort()

    listOfIngredients[0] = listOfIngredients[0].replaceFirstChar{it.uppercase()}
    listOfIngredients[listOfIngredients.lastIndex] += "."

    println(listOfIngredients)
}