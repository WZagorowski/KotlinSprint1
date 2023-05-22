package lesson_10

fun main() {

        do {
            println("Username and password must be longer than 3 symbols.\nEnter your Username:")
            val isUserNameOk = setCheckLength(readln())

            println("Enter your Password:")
            val isUserPasswordOk = setCheckLength(readln())
        }
        while (!isUserNameOk || !isUserPasswordOk)

        println("Welcome!")
}

fun setCheckLength(userData: String): Boolean = userData.lastIndex >= 3