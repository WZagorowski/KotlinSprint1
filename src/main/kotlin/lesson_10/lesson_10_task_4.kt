package lesson_10

fun main() {

    println("Игра против компьютера в кости. Побеждает выбросивший наибольшее число. Стартуем!")
    var humanWins = 0

    do {
        humanWins = getNewRound(humanWins)
        println("Хотите бросить кости еще раз (да/нет)?")

    } while (readln() == "да")

        println("Человек выйграл партий: $humanWins")
}

fun getNewRound(humanWinsBefore: Int): Int {

    val humanResult = getShootDice()
    println("Человек выбросил $humanResult")

    val computerResult = getShootDice()
    println("Компьютер выбросил $computerResult")

    return humanWinsBefore + compareResults(humanResult, computerResult)
}

fun getShootDice(): Int = (1..6).random() + (1..6).random()

fun compareResults(humanResult: Int, computerResult: Int): Int {

    var counter = 0

    if (humanResult > computerResult) {
        println("Победил человек")
        counter += 1
    } else if (humanResult == computerResult)
        println("Ничья")
    else
        println("Победил компьютер")

    return counter
}