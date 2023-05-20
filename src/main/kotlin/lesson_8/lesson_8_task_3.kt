package lesson_8

fun main() {
    val dishIngredients = arrayOf("мясо", "рис", "морковь", "лук", "чеснок", "перец", "соль", "пряности", "масло")

    println("Введите название ингредиента, чтобы узнать есть ли он в блюде:")
    val yourIngredient = readln()

    if (yourIngredient.lowercase() in dishIngredients)
        println("Ингредиент $yourIngredient в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")
}