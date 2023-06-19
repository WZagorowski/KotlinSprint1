package lesson_15

fun main() {
    val car1 = PassengerCar("Mazda")
    val car2 = PassengerCar("Toyota")
    val truck1 = AutoTruck("MAN")

    car1.transportPassenger()
    car2.transportPassenger()
    truck1.transportLoad()
    truck1.transportPassenger()
    car1.ride()
    car2.ride()
    truck1.ride()
}

abstract class Vehicle(
    val vehicleName: String,
    val quantityOfPassengers: Int,
    val maxLoadWeight: Int,
)

class PassengerCar(
    vehicleName: String,
    quantityOfPassengers: Int = 3,
) : Vehicle(vehicleName, quantityOfPassengers, maxLoadWeight = 0), Movable, PassengerAcceptable {

    override fun ride() = println("Легковой автомобиль $vehicleName двигается по маршруту.")

    override fun transportPassenger() =
        println("Легковой автомобиль $vehicleName перевезет пассажиров: не более $quantityOfPassengers чел.")
}

class AutoTruck(
    vehicleName: String,
    quantityOfPassengers: Int = 1,
    maxLoadWeight: Int = 2000,
) : Vehicle(vehicleName, quantityOfPassengers, maxLoadWeight), Movable, PassengerAcceptable, LoadAcceptable {

    override fun ride() = println("Грузовик $vehicleName двигается по маршруту.")

    override fun transportPassenger() =
        println("Грузовик $vehicleName перевезет пассажиров: не более $quantityOfPassengers чел.")

    override fun transportLoad() = println("Грузовик $vehicleName перезет грузов: не более $maxLoadWeight кг.")
}

interface Movable {
    fun ride()
}

interface PassengerAcceptable {
    fun transportPassenger()
}

interface LoadAcceptable {
    fun transportLoad()
}