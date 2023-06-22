package lesson_18

fun main() {

    val dice4 = FourSidesDice()
    val dice6 = SixSidesDice()
    val dice8 = EightSidesDice()

    dice4.getShootingDice()
    dice6.getShootingDice()
    dice8.getShootingDice()
}

abstract class AbstractDice(private val numberSide: Int) {

    fun getShootingDice() = println((1..numberSide).random())
}

private class FourSidesDice(numberSide: Int = 4) : AbstractDice(numberSide)

private class SixSidesDice(numberSide: Int = 6) : AbstractDice(numberSide)

private class EightSidesDice(numberSide: Int = 8) : AbstractDice(numberSide)