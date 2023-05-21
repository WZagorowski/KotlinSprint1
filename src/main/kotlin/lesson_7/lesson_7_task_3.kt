package lesson_7

fun main() {
    var result = ""

    println("Enter your number")

    for (number in 0..readln().toInt() step 2)
        result += "$number,"

    print(result)
}