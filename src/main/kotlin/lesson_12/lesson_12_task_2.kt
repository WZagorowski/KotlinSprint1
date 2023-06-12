package lesson_12

fun main() {

    val weather11062023 = WeatherData(+21,+11,false,753.25,)
    val weather12062023 = WeatherData(+23,+10,false,754.29,)
    val weather13062023 = WeatherData(+18, +9,true, 753.45,)

    weather11062023.outputWeatherData()
    weather12062023.outputWeatherData()
    weather13062023.outputWeatherData()
}

private class WeatherData(dayTemperature: Int, nightTemperature: Int, isItRaining: Boolean, atmospherePressure: Double,) {
    var dayTemperature = dayTemperature
    var nightTemperature = nightTemperature
    var isItRaining = isItRaining
    var atmospherePressure = atmospherePressure

    fun outputWeatherData() {
        println("""
            
            Температура днем: $dayTemperature
            Температура ночью: $nightTemperature
            Дождь в этот день: $isItRaining
            Атмосферное давление: $atmospherePressure """.trimIndent())
    }
}

