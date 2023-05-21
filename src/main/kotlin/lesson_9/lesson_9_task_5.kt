package lesson_9

fun main() {

    val listOfIngredients = mutableListOf<String>()

    println("Введите 5 ингридиентов, каждый с новой строки: ")

    for (i in 1..5) {
        val ingredient = readln()

        if (listOfIngredients.contains(ingredient))
            continue
        else
            listOfIngredients.add(ingredient)
    }

    listOfIngredients.sort()
    var result: String = ""

    listOfIngredients.forEach {
        result += "$it,"
    }
        println(result.capitalize() + ".")
}