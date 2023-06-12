package lesson_12

fun main() {

    val listOfData10 = mutableListOf<WeatherData>()

    for (i in 1..10) {
        listOfData10.add(WeatherData(
            dayTemperature = (15..+30).random(),
            nightTemperature = (-5..+10).random(),
            atmospherePressure = (750..765).random(),
            rainyDays = (0..1).random(),))
    }

    var sumDayTemperature: Double = 0.0
    var sumNightTemperature: Double = 0.0
    var sumPressure: Double = 0.0
    var rainyDays: Int = 0

    for (it in listOfData10) {
        sumDayTemperature += it.dayTemperature
        sumNightTemperature += it.nightTemperature
        sumPressure += it.atmospherePressure
        rainyDays += it.rainyDays
    }

    println("""
            Статистика за ${listOfData10.size} дней:
            Средняя температура днем: ${sumDayTemperature/listOfData10.size}
            Средняя температура ночью: ${sumNightTemperature/listOfData10.size}
            Среднее атмосферное давление: ${sumPressure/listOfData10.size}
            Количество дождливых дней: $rainyDays""".trimIndent())
}

private class WeatherData(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val atmospherePressure: Int,
    val rainyDays: Int,
    )