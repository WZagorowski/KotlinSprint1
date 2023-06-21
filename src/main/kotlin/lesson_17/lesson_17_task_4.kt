package lesson_17

fun main() {

    val parcel17 = NewParcel(100056780017)

    parcel17.currentLocation = "Варшава. Склад MediaExpert."
    parcel17.currentLocation = "Варшава. Сортировочный пункт DHL."
    parcel17.currentLocation = "Познань. Сортировочный пункт DHL."
    parcel17.currentLocation = "Вроцлав. Склад DHL."
    parcel17.showParcelStatus()
}

private class NewParcel(parcelNumber: Long) {

    var parcelNumber = parcelNumber
        set(value) = println("Ошибка! Номер посылки не может быть изменен.")

    private var locationChangeCount = 0

    var currentLocation = ""
        set(value) {
            field = value
            locationChangeCount++
        }

    fun showParcelStatus() {
        println(
            """
            Посылка №$parcelNumber.
            Текущее местоположение: $currentLocation
            Счетчик перемещений: $locationChangeCount
            """.trimIndent()
        )
    }
}