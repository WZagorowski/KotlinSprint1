package lesson_20

fun main() {
    val user01 = User("Дед Мороз")

    val getSplashScreen: (String) -> String = { name: String ->
        "С наступающим Новым Годом, $name!"
    }

    println(getSplashScreen(user01.userName))
}

private class User(val userName: String)