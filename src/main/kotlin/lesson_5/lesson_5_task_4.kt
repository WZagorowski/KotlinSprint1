package lesson_5
fun main(){
    println("Enter your username")
    val userName = readLine()

    val userVerify =
        if (userName != "Batman") "Create your account"
        else {
            println("Enter your password")
            val userPassword = readLine()
            if (userPassword != "password") "Authorization error"
            else "Welcome, $userName!"
        }
    println(userVerify)
}