package lesson_2

import kotlin.math.pow

fun main() {
    val money: Double = 70000.0
    val percent: Double = 16.7
    val time: Double = 20.0

    val result = money * ((1 + (percent / 100)).pow(time))
    val finalResult = String.format("%.3f", result)
    println(finalResult)
}