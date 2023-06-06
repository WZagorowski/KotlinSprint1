package lesson_10

fun main() {

    do {
        println("Username and password must be longer than 3 symbols.\nEnter your Username:")
        val isUserNameOk = validateInputLength1(readln())

        println("Enter your Password:")
        val isUserPasswordOk = validateInputLength1(readln())
    }
    while (!isUserNameOk || !isUserPasswordOk)

    println("Welcome!")
}

fun validateInputLength1(userData: String): Boolean = userData.lastIndex >= 3