package lesson_10

fun main() {

    println("Registration. Enter your Username:")
    val userName = readln()
    val password = randomPassword()
    val isUserNameOk = checkLength(userName)

    if (!isUserNameOk) {
        println("Username not long enough")
        return
    } else
        println("Your password is:\n$password")

    while (true) {

        println("\nAuthorization. Enter your\nUsername:\nPassword:")

        val isUserNameTrue = checkTrue(userName)
        val isPasswordTrue = checkTrue(password)

        if (!isUserNameTrue || !isPasswordTrue) {
            println("Error! Try again.")
            break
        }
        else do {
            val yourCode = randomCode().toString()
            println("Your SMS code is: $yourCode \nEnter your SMS code:")
        } while (readln() != yourCode)

        println("Welcome! $userName")
        return
    }
}
fun checkLength(userData: String): Boolean = userData.lastIndex >= 3
fun randomPassword(): String {
    var password = ""
    val char: List<Char> = ('1'..'9') + ('a'..'z') + ('A'..'Z')

    for (i in 1..4)
        password += char.random()
    return password
}
fun checkTrue(userData: String): Boolean = userData == readln()
fun randomCode() = (1000..9999).random()