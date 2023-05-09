package lesson_3
fun main(){
    val helloDay = "Добрый день"
    val helloNight = "Доброй ночи"
    val user = "Пользователь"
    var helloUser = helloDay + ", $user!"
    println(helloUser)
    helloUser = helloNight + ", $user!"
    println(helloUser)
}