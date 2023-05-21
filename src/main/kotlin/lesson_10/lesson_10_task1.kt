package lesson_10
fun main() {

    println("Ход человека (нажми \"Enter\" для броска):")
    readln()

    val humanOne = bones()
    val humanTwo = bones()
    println("Человек выбросил $humanOne и $humanTwo")

    println("Ход компьютера (нажми \"Enter\" для броска):")
    readln()

    val computerOne = bones()
    val computerTwo = bones()
    println("Компьютер выбросил $computerOne и $computerTwo")

    if (humanOne + humanTwo > computerOne + computerTwo)
        println("Победил человек")
    else if (humanOne + humanTwo == computerOne + computerTwo)
        println("Ничья")
    else
        println("Победил компьютер")
}
fun bones() = (1..6).random()