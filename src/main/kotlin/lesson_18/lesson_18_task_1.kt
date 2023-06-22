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

    val arrayOfNotes = arrayOf<NewOrder1>(order1, order2)
    showAllOrders(arrayOfNotes)
}

fun showAllOrders(orders: Array<NewOrder1>) {
    orders.forEach {
        println(it.getOrderProduct())
    }
}

open class NewOrder1 {

    open fun getOrderProduct() = ""
}

class OnlyItemOrder(
    private val orderNumber: String,
    private val productName: String,
) : NewOrder1() {

    override fun getOrderProduct() = "Заказан товар: $productName"
}

class ListItemOrder(
    private val orderNumber: String,
    private val listProductName: List<String>,
) : NewOrder1() {

    override fun getOrderProduct() = "Заказан товар \"$listProductName\""
}