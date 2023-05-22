package lesson_9

fun main() {

    val listForOne = mutableListOf(2, 50, 15)

    println("Введите количество порций блюда \"Омлет\":")

    val quantity = readln().toInt()
    val listForAll = listForOne.map { it * quantity }

    println("На $quantity порций потребуется: яиц - ${listForAll[0]} шт, " +
            "молока - ${listForAll[1]} мл, сливочного масла - ${listForAll[2]} гр.")
}