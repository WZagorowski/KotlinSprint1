package lesson_10

fun main() {

    var humanWins = 0

    while (true) {
        humanWins = newRound(humanWins)

        println("Хотите бросить кости еще раз (да/нет)?")

        if (readln() == "нет") {
            println("Человек выйграл партий: $humanWins")
            break
        }
    }
}

fun newRound(humanWinsBefore: Int): Int {

    var humanWinsAfter = humanWinsBefore

    val humanBones = bones()
    println("Человек выбросил $humanBones")

    val computerBones = bones()
    println("Компьютер выбросил $computerBones")

    if (humanBones > computerBones) {
        println("Победил человек")
        humanWinsAfter += 1
    }
    else if (humanBones == computerBones)
        println("Ничья")
    else
        println("Победил компьютер")
    return humanWinsAfter
}

fun bones(): Int = (1..6).random() + (1..6).random()
