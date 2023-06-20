package lesson_16

fun main(){

    val shootingDice1 = Dice6()

    shootingDice1.getResult()
}

private class Dice6 {

    private var shootingDice = (1..6).random()

    fun getResult() = println(shootingDice)
}