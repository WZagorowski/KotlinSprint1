package lesson_12

fun main() {

    val weatherToday = WeatherData4(23, 10, 754.29)
    val weatherTomorrow = WeatherData4(18, 9, 753.45, true)
}

private class WeatherData4(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val atmospherePressure: Double,
    val isItRaining: Boolean = false,
    ) {

    init {
        println(
            """
                
            Температура днем: $dayTemperature
            Температура ночью: $nightTemperature
            Дождь в этот день: $isItRaining
            Атмосферное давление: $atmospherePressure """.trimIndent()
        )
    }
}