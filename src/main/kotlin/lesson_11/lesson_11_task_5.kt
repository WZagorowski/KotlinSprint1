package lesson_11

fun main() {

    val newForum = Forum ()

    newForum.newUser("Чебурашка","12345ап!","cheburator123@qmail.qom", "Маленький, хороший",)
    newForum.newUser("Гена","1234","crocodilegena@qmail.qom", "Особо опасен!",)
    newForum.newMessage(2, "Здаров, мелкий")
    newForum.newMessage(1, "Добрый день")
    newForum.newMessage(2, "Есть курить?")
    newForum.newMessage(1, "Нет, извините")
    newForum.printThread()
}

class Forum (
    private val listOfUsers: MutableList<User5> = mutableListOf(),
    private val usersHistory: MutableList<String> = mutableListOf(),
    private val messagesHistory: MutableList<String> = mutableListOf(),
    private val mapUserIdToLogin: MutableMap<Int,String> = mutableMapOf(),
    ) {

    private var userId = 0

    fun newUser(login: String, password: String, email: String, bio: String,) {
        val id = ++userId
        listOfUsers.add(User5(id, login, password, email, bio))
        mapUserIdToLogin[id] = login
        println("Новый пользователь '$login' добавлен. Пользователю присвоин ID: $id")
    }

    fun newMessage(id: Int, message: String) {
        val loginFromMap = mapUserIdToLogin[id] ?: "Error. Unknown data."
        usersHistory.add(loginFromMap)
        messagesHistory.add(message)
    }

    fun printThread() {
        println("\nИстория сообщений:")
        val result = usersHistory.zip(messagesHistory)
        for (word in result)
            println("${word.first}: ${word.second}")
    }

    class User5(
        val id: Int,
        val login: String,
        var password: String,
        val email: String,
        var bio: String,
        )
}