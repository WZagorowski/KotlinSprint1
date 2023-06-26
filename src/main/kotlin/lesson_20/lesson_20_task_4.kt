package lesson_20

fun main() {
    val listOfItems = listOf("red", "orange", "yellow", "green", "blue", "indigo", "violet")

    val resultList = listOfItems.filterIndexed { index, _ -> index % 2 == 1 }

    resultList.map {
        { it: String -> println("Нажат элемент $it") }(it)
    }

}

