package lesson_12

fun main() {

    val weather110623 = WeatherData2(+21,+11,false,753.25,)
    val weather120623 = WeatherData2(+23,+10,false,754.29,)
    val weather130623 = WeatherData2(+18, +9,true, 753.45,)

    weather110623.outputWeatherData()
    weather120623.outputWeatherData()
    weather130623.outputWeatherData()
}

private class WeatherData2(
    dayTemperature: Int,
    nightTemperature: Int,
    isItRaining: Boolean,
    atmospherePressure: Double,
    ) {

    val dayTemperature = dayTemperature
    val nightTemperature = nightTemperature
    val isItRaining = isItRaining
    val atmospherePressure = atmospherePressure

    fun outputWeatherData() {
        println("""
            
            Температура днем: $dayTemperature
            Температура ночью: $nightTemperature
            Дождь в этот день: $isItRaining
            Атмосферное давление: $atmospherePressure """.trimIndent())
    }
}

