package lesson_4

fun main(){
    val reservedToday = 13
    val reservedTomorrow = 9

    val freeToday = reservedToday < NUMBER_OF_TABLES
    val freeTomorrow = reservedTomorrow < NUMBER_OF_TABLES
    println("Доступность столиков на сегодня: $freeToday\nДоступность столиков на завтра: $freeTomorrow")
}

const val NUMBER_OF_TABLES = 13