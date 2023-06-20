package lesson_15

fun main() {

    val accessory1 = Accessory("Струна", 2675)
    val accessory2 = Accessory("Медиатор", 843)
    val accessory3 = Accessory("Средство по уходу", 86)
    val instrument1 = MusicalInstrument("Гитара", 237, listOf(accessory1, accessory2, accessory3))

    instrument1.searchTheProduct()
}

abstract class MusicalProduct(val productName: String, val quantityOfProducts: Int)

class MusicalInstrument(
    productName: String,
    quantityOfProducts: Int,
    private val listOfAccessories: List<Accessory> = listOf()
) : MusicalProduct(productName, quantityOfProducts), Searchable {

    override fun searchTheProduct() {
        println("Выполняется поиск комплектующих к инструменту $productName:")
        listOfAccessories.forEach { println("${it.productName} - количество на складе: ${it.quantityOfProducts}.") }
    }
}

class Accessory(productName: String, quantityOfProducts: Int) : MusicalProduct(productName, quantityOfProducts)

interface Searchable {
    fun searchTheProduct()
}