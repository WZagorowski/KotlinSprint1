package lesson_19

fun main() {

    val product01 = Product("набор карандашей", 2001, Category.STATIONERY)
    val product02 = Product("рюкзак", 1027, Category.CLOTHES)
    val product03 = Product("брелок", 3042, Category.OTHER_PRODUCTS)

    product01.printProductInfo()
    product02.printProductInfo()
    product03.printProductInfo()
}

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER_PRODUCTS,
}

fun getCategoryName(category: Category): String {
    return when (category) {
        Category.CLOTHES -> "Категория: одежда"
        Category.STATIONERY -> "Категория: канцелярские товары"
        Category.OTHER_PRODUCTS -> "Категория: разное"
    }
}

private class Product(val name: String, val id: Int, val category: Category) {

    fun printProductInfo() = println("Название: $name\nId: $id \n${getCategoryName(category)}\n")
}