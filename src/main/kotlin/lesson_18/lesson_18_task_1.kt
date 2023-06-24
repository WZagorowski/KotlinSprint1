package lesson_18

fun main() {

    val order1: NewOrder1 = OnlyItemOrder(
        "n230623o01",
        "Наушники",
    )

    val order2: NewOrder1 = ListItemOrder(
        "n230623o02",
        listOf("Клавиатура", "Коврик", "Мышь", "Подставка"),
    )

    val listOfOrders = listOf(order1, order2)
    showAllOrders(listOfOrders)
}

fun showAllOrders(orders: List<NewOrder1>) {
    orders.forEach {
        println(it.getOrderedProduct())
    }
}

open class NewOrder1 {

    open fun getOrderedProduct() = ""
}

class OnlyItemOrder(
    private val orderNumber: String,
    private val productName: String,
) : NewOrder1() {

    override fun getOrderedProduct() = "Заказан товар: $productName"
}

class ListItemOrder(
    private val orderNumber: String,
    private val listProductName: List<String>,
) : NewOrder1() {

    override fun getOrderedProduct(): String {
        var result = ""
        listProductName.forEach { result += " $it," }

        return "Заказаны следующие товары:${result.dropLast(1)}"
    }
}