package lesson_10
fun main() {

    println("Ход человека (нажми \"Enter\" для броска):")
    readln()
    val humanResult = getShootDice1()
    println("Человек выбросил $humanResult")

    println("Ход компьютера (нажми \"Enter\" для броска):")
    readln()
    val computerResult = getShootDice1()
    println("Компьютер выбросил $computerResult")

    if (humanResult > computerResult)
        println("Победил человек")
    else if (humanResult == computerResult)
        println("Ничья")
    else
        println("Победил компьютер")
}

fun getShootDice1(): Int = (1..6).random() + (1..6).random()