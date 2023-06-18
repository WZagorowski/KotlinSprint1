package lesson_15

fun main() {

    val user1 = User15("Чипалино", "chipalino770615@qmail.pl")
    val user2 = User15("Сеньор Помидор", "tomatomr123@qmail.pl")
    val user3 = Administrator15("Папа Карло", "administrate111@qmail.pl")

    user1.createMessage("Куплю гараж! Желательно с картофельной ямой (для лука).")
    user2.readMessage(1)
    user2.createMessage("Зачем тебе яма? Лук там испортится, идиот.")
    user1.readMessage(2)
    user1.createMessage("Сообщение вырезано цензурой (ненормативная лексика)")
    println()
    user3.readMessage(3)
    user3.deleteMessage(3)
    user3.createMessage("Предупреждение пользователю ${user1.userName}. Еще раз и в бан!")
    println()
    user1.readMessage(4)
    user1.createMessage("Сообщение вырезано цензурой (ненормативная лексика)")
    println()
    user3.readMessage(5)
    user3.deleteMessage(5)
    user3.deleteUser("Чипалино")
}

abstract class BasicUser15(val userName: String, val email: String) {

    fun createMessage(message: String) {
        println("Пользователь $userName написал сообщение: $message")
    }

    fun readMessage(messageId: Int) {
        println("Пользователь $userName читает сообщение $messageId")
    }
}

interface Administrable {
    fun deleteMessage(messageId: Int)
    fun deleteUser(deletedUser: String)
}

class User15(userName: String, email: String) : BasicUser15(userName, email)

class Administrator15(userName: String, email: String) : BasicUser15(userName, email), Administrable {

    override fun deleteMessage(messageId: Int) {
        println("Администратор $userName удалил сообщение с ID №$messageId")
    }

    override fun deleteUser(deletedUser: String) {
        println("Администратор $userName забанил пользователя \"$deletedUser\"")
    }
}