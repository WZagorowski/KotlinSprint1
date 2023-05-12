package lesson_2
fun main(){
    val hourOfDeparture: Int = 9
    val minuteOfDeparture: Int = 39
    val travelTime: Int = 457
    val arrivalInMinutes = (hourOfDeparture * 60 + minuteOfDeparture + travelTime) % 1440
    val hourOfArrival = arrivalInMinutes / 60
    val minuteOfArrival = arrivalInMinutes % 60
    val arrivalTime = String.format("$hourOfArrival:%02d",minuteOfArrival)
    println("Arrival time is $arrivalTime")
}