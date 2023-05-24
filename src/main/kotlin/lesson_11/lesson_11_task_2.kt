package lesson_11

fun main() {

    val userOne = User1(
        id = 1111,
        login = "Чебурашка",
        password = "1234",
        email = "cheburator123@gmail.com",
        bio = ""
    )

    userOne.bio = userOne.readUserBio()
    userOne.password = userOne.changeUserPassword(userOne.password)
    userOne.printUserData()
    userOne.printMessageToUser(userOne.login)

}

class User1(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {

    fun printUserData() {
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun readUserBio(): String {
        println("Заполни поле bio:")
        bio = readln()
        return bio
    }

    fun changeUserPassword (password: String): String {
        do {
            println("Для смены пароля нужно ввести текущий пароль:")
            val oldPassword = readln()
        } while(password != oldPassword)

        println("Введите ваш новый пароль:")
        val newPassword = readln()
        println("Пароль успешно изменен!")
        return newPassword
    }

    fun printMessageToUser(login: String) {
        println("Кажется тут надо что-то написать пользователю:")
        val messageToUser = readln()
        println("Добрый день, $login! \n$messageToUser \nВсего наилучшего!")
    }

}