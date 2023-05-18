package lesson_4

fun main(){

    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val isWinter = true

    val resultForBeans = (isSunny == IS_SUNNY_FOR_BEANS) && (isTentOpen == IS_TENT_OPEN_FOR_BEANS) &&
            (humidity == HUMIDITY_FOR_BEANS) && (isWinter == IS_WINTER_FOR_BEANS)

    println("Благоприятные ли условия сейчас для роста бобовых? $resultForBeans")
}

const val IS_SUNNY_FOR_BEANS = true
const val IS_TENT_OPEN_FOR_BEANS = true
const val HUMIDITY_FOR_BEANS = 20
const val IS_WINTER_FOR_BEANS = false