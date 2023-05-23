package lesson_10
fun main() {

    println("Ход человека (нажми \"Enter\" для броска):")
    readln()
    val humanResult = getShootDice()
    println("Человек выбросил $humanResult")

    println("Ход компьютера (нажми \"Enter\" для броска):")
    readln()
    val computerResult = getShootDice()
    println("Компьютер выбросил $computerResult")

    if (humanResult > computerResult)
        println("Победил человек")
    else if (humanResult == computerResult)
        println("Ничья")
    else
        println("Победил компьютер")
}

fun getShootDice(): Int = (1..6).random() + (1..6).random()