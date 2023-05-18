package lesson_8

fun main() {
    val dishIngredients = arrayOf("мясо", "рис", "морковь", "лук", "чеснок", "перец", "соль", "пряности", "масло")

    println("Введите название ингредиента, чтобы узнать есть ли он в блюде:")
    val yourIngredient = readln()

    for (i in dishIngredients) {

        while (i == yourIngredient.lowercase()) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}