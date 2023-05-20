package lesson_8

fun main() {

    val dishIngredients = arrayOf("вода", "макарошки", "соль")
    for (i in dishIngredients)
        print("$i, ")

    println("\nВведите название ингредиента, который вы хотите заменить:")
    val oldIngredient = readln()

    if (oldIngredient !in dishIngredients)
        println("Ингредиента $oldIngredient в рецепте нет")

    else {
        println("Ингредиент, который вы хотите добавить:")
        dishIngredients[dishIngredients.indexOf(oldIngredient)] = readln()

        println("Готово! Вы сохранили следующий список:")

        for (i in dishIngredients)
            print("$i, ")
    }
}