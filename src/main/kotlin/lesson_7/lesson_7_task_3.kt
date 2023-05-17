package lesson_7

fun main() {
    println("Enter your number")
    val yourNumber = readln().toInt()
    val rangeNumbers = 0..yourNumber step (2)

    for (number in rangeNumbers)
        print("$number")
}