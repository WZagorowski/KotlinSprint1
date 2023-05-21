package lesson_9

fun main() {

    val listOfIngredients = mutableListOf("кофе молотый", "кипяток", "сливки")

    println("В рецепте есть базовые ингредиенты:")
    for (i in listOfIngredients)
        println(i)

    println("Желаете добавить еще? (да/нет)")

    if (readln() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        listOfIngredients.add(readln())
    } else
        return

    println("Теперь в рецепте есть следующие ингредиенты:")
    for (i in listOfIngredients)
        println(i)
}