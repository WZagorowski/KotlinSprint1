package lesson_2
fun main() {
    val crystalOreWithoutBuff = 7
    val ironOreWithoutBuff = 11

    val bonusCrystal = (crystalOreWithoutBuff * 1.2 - crystalOreWithoutBuff).toInt()
    val bonusIron = (ironOreWithoutBuff * 1.2 - ironOreWithoutBuff).toInt()
    println("Bonus crystal ore = $bonusCrystal \nBonus iron ore = $bonusIron")
}
