package lesson_10
fun main() {

    println("Ход человека (нажми \"Enter\" для броска):")
    readln()
    val humanBones = getShootDice()
    println("Человек выбросил $humanBones")

    println("Ход компьютера (нажми \"Enter\" для броска):")
    readln()
    val computerBones = getShootDice()
    println("Компьютер выбросил $computerBones")

    if (humanBones > computerBones)
        println("Победил человек")
    else if (humanBones == computerBones)
        println("Ничья")
    else
        println("Победил компьютер")
}

fun getShootDice(): Int = (1..6).random() + (1..6).random()