package lesson_12

fun main() {

    val weatherToday = WeatherData(23, 10, 754.29)
    val weatherTomorrow = WeatherData(18, 9, 753.45, true)
}

private class WeatherData(
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