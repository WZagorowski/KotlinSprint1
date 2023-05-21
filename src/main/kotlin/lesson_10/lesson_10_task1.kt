package lesson_10
fun main() {

    println("Ход человека (нажми \"Enter\" для броска):")
    readln()
    val humanBones = bones()
    println("Человек выбросил $humanBones")

    println("Ход компьютера (нажми \"Enter\" для броска):")
    readln()
    val computerBones = bones()
    println("Компьютер выбросил $computerBones")

    if (humanBones > computerBones)
        println("Победил человек")
    else if (humanBones == computerBones)
        println("Ничья")
    else
        println("Победил компьютер")
}
fun bones(): Int = (1..6).random() + (1..6).random()