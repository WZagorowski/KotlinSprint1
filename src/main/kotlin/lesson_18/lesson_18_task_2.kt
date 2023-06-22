package lesson_18

fun main() {

    val dice4 = FourSidedDice()
    val dice6 = SixSidedDice()
    val dice8 = EightSidedDice()

    dice4.getShootingDice()
    dice6.getShootingDice()
    dice8.getShootingDice()
}

abstract class AbstractDice(private val numberSide: Int) {

    fun getShootingDice() = println((1..numberSide).random())
}

private class FourSidedDice(numberSide: Int = 4) : AbstractDice(numberSide)

private class SixSidedDice(numberSide: Int = 6) : AbstractDice(numberSide)

private class EightSidedDice(numberSide: Int = 8) : AbstractDice(numberSide)