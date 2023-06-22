package lesson_16

fun main() {

    val order101 = NewOrder(20062023000001)

    order101.showOrderStatus()
    order101.askForChangeOrderStatus()
    order101.showOrderStatus()
}

private class NewOrder(private val orderNumber: Long, private var orderStatus: String = "Принят") {

    val listOfStatus = listOf("Принят", "В ожидании", "Закрыт")

    fun showOrderStatus() = println("Текущий статус заказа: \"$orderStatus\"")

    private fun changeOrderStatus(newStatus: String) {
        orderStatus = newStatus
    }

    fun askForChangeOrderStatus() {
        println("Выберите номер нового статуса заказа:\n1. ${listOfStatus[1]}\n2. ${listOfStatus[2]}")
        var newStatus = readln()
        when (newStatus) {
            "1" -> newStatus = listOfStatus[1]
            "2" -> newStatus = listOfStatus[2]
            else -> println("Ошибка!")
        }
        changeOrderStatus(newStatus)
    }
}