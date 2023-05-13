package lesson_5
fun main(){
    println("Введите год вашего рождения")
    val userAge = 2023 - readLine()!!.toInt()
    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"
    println(resultText)
}

const val AGE_OF_MAJORITY = 18