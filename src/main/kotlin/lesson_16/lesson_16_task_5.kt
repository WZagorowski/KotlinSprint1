package lesson_16

fun main() {
    val orc1 = Player("Thrall")

    orc1.getDamage(25)
    orc1.getMedicine(5)
    orc1.showPlayerInfo()
    orc1.getDamage(48)
    orc1.getDamage(40)
    orc1.getMedicine(50)
    println()
    orc1.showPlayerInfo()
}

private class Player(private val name: String) {

    private var healthPoints: Int = 100
    private var attackPower: Int = 15

    fun getDamage(damage: Int) {
        healthPoints -= damage
        if (healthPoints < 1)
            death()
    }

    fun getMedicine(medicine: Int) {
        if (healthPoints > 0)
            healthPoints += medicine

        if (healthPoints > 100)
            healthPoints = 100
    }

    private fun death() {
        attackPower = 0
        healthPoints = 0
        println("Player $name is dead!")
    }

    fun showPlayerInfo() {
        println("Name: $name\nHP: $healthPoints\nAttack: $attackPower")
    }
}