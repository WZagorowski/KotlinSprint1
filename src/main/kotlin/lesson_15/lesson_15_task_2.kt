package lesson_15

fun main() {

    val message01 = MessageAboutTemperature(26.5)
    val message02 = MessageAboutRainfall(1.2)

    message01.connectWithServer()
    message01.sendMessage()
    message02.connectWithServer()
    message02.sendMessage()
}

abstract class MessageToServer {

    abstract val messageText: Double

    abstract fun connectWithServer()
    abstract fun sendMessage()
}

class MessageAboutTemperature(override val messageText: Double) : MessageToServer() {

    override fun connectWithServer() {
        println("Подключиться к серверу. Раздел с данными о температуре.")
    }

    override fun sendMessage() {
        println("Отправить на сервер данные о температуре: $messageText")
    }
}

class MessageAboutRainfall(override val messageText: Double) : MessageToServer() {

    override fun connectWithServer() {
        println("Подключиться к серверу. Раздел с данными о количестве осадков.")
    }

    override fun sendMessage() {
        println("Отправить на сервер данные о количестве осадков: $messageText")
    }
}