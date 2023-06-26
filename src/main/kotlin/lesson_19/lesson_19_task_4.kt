package lesson_19

fun main() {

    val leopard1 = Tank("Leopard")

    leopard1.fire()
    leopard1.fire()
    leopard1.changeCartridge(Cartridge.GREEN)
    leopard1.fire()
    leopard1.changeCartridge(Cartridge.RED)
    leopard1.fire()
}

enum class Cartridge(val color: String, val damage: Int) {
    BLUE("синий", 5),
    GREEN("зеленый", 10),
    RED("красный", 20),
}

private class Tank(
    val name: String,
    var cartridge: Cartridge = Cartridge.BLUE,
) {

    fun changeCartridge(newCartridge: Cartridge) {
        cartridge = newCartridge
        println("$name изменил вид патронов на ${cartridge.color}.")
    }

    fun fire() = println("$name совершил выстрел. Урон составил ${cartridge.damage} единиц.")
}