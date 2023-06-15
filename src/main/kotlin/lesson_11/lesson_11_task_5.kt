package lesson_11

fun main() {

    val newForum = Forum()

    newForum.newUser("Чебурашка", "12345ап!", "cheburator123@qmail.qom", "Маленький, хороший")
    newForum.newUser("Гена", "1234", "crocodilegena@qmail.qom", "Особо опасен!")
    newForum.newMessage(2, "Здаров, мелкий")
    newForum.newMessage(1, "Добрый день")
    newForum.newMessage(2, "Есть курить?")
    newForum.newMessage(1, "Нет, извините")
    newForum.printThread()
}

private class Forum(
    private val listOfUsers: MutableList<User5> = mutableListOf(),
    private val messagesHistory: MutableList<Message5> = mutableListOf(),
    ) {

    private var userId = 0

    fun newUser(login: String, password: String, email: String, bio: String) {
        val id = ++userId
        listOfUsers.add(User5(id, login, password, email, bio))
        println("Новый пользователь '$login' добавлен. Пользователю присвоин ID: $id")
    }

    fun newMessage(userId: Int, text: String) {
        listOfUsers.forEach {
            if (it.id == userId)
                messagesHistory.add(Message5(it.id, it.login, text))
        }
    }

    fun printThread() {
        println("\nИстория сообщений:")
        messagesHistory.forEach { println("${it.userLogin}: ${it.messageText}") }
    }

    class User5(
        val id: Int,
        val login: String,
        var password: String,
        val email: String,
        var bio: String,
    )

    class Message5(
        val userId: Int,
        val userLogin: String,
        val messageText: String,
    )
}