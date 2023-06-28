package lesson_20

fun main() {
    val listOfItems = listOf("red", "orange", "yellow", "green", "blue", "indigo", "violet")

    val lambda = { list: List<String> ->
        list.map {
            println("Нажат элемент \"$it\"")
        }
    }

    lambda(listOfItems.filterIndexed { index, _ -> index % 2 == 1 })
}

