package lesson_10

fun main() {

    do {
        println("Username and password must be longer than 3 symbols.\nEnter your Username:")
        val isUserNameOk = validateInputLength(readln())

        println("Enter your Password:")
        val isUserPasswordOk = validateInputLength(readln())
    }
    while (!isUserNameOk || !isUserPasswordOk)

    println("Welcome!")
}

fun validateInputLength(userData: String): Boolean = userData.lastIndex >= 3