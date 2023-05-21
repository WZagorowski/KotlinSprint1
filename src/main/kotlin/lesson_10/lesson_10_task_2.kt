package lesson_10
fun main() {

    println("Enter your Username:")
    val userName = readln()
    val isUserNameOk = checking(userName)

    println("Enter your Password:")
    val userPassword = readln()
    val isUserPasswordOk = checking(userPassword)

    if (isUserNameOk && isUserPasswordOk)
        println("Welcome $userName!")
    else
        println("Username or password is not long enough")
}
fun checking(userData: String): Boolean = userData.lastIndex >= 3