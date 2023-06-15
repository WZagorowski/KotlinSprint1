package lesson_12

fun main() {

    val weather1106 = WeatherData3(21, 11, 753.25)
    val weather1206 = WeatherData3(23, 10, 754.29)
    val weather1306 = WeatherData3(18, 9, 753.45, true)

    weather1106.outputWeatherData()
    weather1206.outputWeatherData()
    weather1306.outputWeatherData()
}

private class WeatherData3(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val atmospherePressure: Double,
    var isItRaining: Boolean = false,
    ) {

    fun outputWeatherData() {
        println(
            """
            
            Температура днем: $dayTemperature
            Температура ночью: $nightTemperature
            Дождь в этот день: $isItRaining
            Атмосферное давление: $atmospherePressure """.trimIndent()
        )
    }
}