package lesson_16

fun main(){

    val order101 = NewOrder()

    order101.showOrderStatus()
    order101.askForChangeOrderStatus("Заказ 20062023000001 собран и ожидает отправления в отделе доставки.")
    order101.showOrderStatus()
}

private class NewOrder {

    private val orderNumber = 20062023000001
    private var orderStatus = "Спасибо за покупку! Вашему заказу присвоен номер: $orderNumber"

    fun showOrderStatus() = println(orderStatus)

    private fun changeOrderStatus(newStatus: String) {
        orderStatus = newStatus
    }

    fun askForChangeOrderStatus(newStatus: String) {
       changeOrderStatus(newStatus)
    }
}