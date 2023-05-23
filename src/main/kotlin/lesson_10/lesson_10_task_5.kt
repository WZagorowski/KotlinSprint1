package lesson_10

fun main() {

    println("Registration. Enter your Username:")
    val userName = readln()
    val password = getRandomPassword()
    val isUserNameOk = validateInputLength(userName)

    if (!isUserNameOk) {
        println("Username not long enough")
        return
    } else
        println("Your password is:\n$password")

    while (true) {

        println("\nAuthorization. Enter your\nUsername:\nPassword:")

        val isUserNameTrue = validateInputData(userName)
        val isPasswordTrue = validateInputData(password)

        if (!isUserNameTrue || !isPasswordTrue) {
            println("Error! Try again.")
            break
        }
        else do {
            val yourCode = getRandomSms().toString()
            println("Your SMS code is: $yourCode \nEnter your SMS code:")
        } while (readln() != yourCode)

        println("Welcome! $userName")
        return
    }
}

fun validateInputLength(userData: String): Boolean = userData.lastIndex >= 3

fun getRandomPassword(): String {
    var password = ""
    val char = ('1'..'9') + ('a'..'z') + ('A'..'Z')

    for (i in 1..4)
        password += char.random()

    return password
}

fun validateInputData(userData: String): Boolean = userData == readln()

fun getRandomSms() = (1000..9999).random()