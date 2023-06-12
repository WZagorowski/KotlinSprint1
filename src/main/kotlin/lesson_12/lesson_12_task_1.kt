package lesson_12

fun main() {

    val weather12062023 = WeatherData()
    weather12062023.dayTemperature = +23
    weather12062023.nightTemperature = +10
    weather12062023.isItRaining = false
    weather12062023.atmospherePressure = 754.29

    val weather13062023 = WeatherData()
    weather12062023.dayTemperature = +18
    weather12062023.nightTemperature = +9
    weather12062023.isItRaining = true
    weather12062023.atmospherePressure = 753.45
}

private class WeatherData {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isItRaining: Boolean = true
    var atmospherePressure: Double = 0.0
}