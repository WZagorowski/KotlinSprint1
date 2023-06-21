package lesson_15

fun main() {
    val car1 = PassengerCar(vehicleName = "Mazda", quantityOfPassengers = 3)
    val car2 = PassengerCar(vehicleName = "Toyota", quantityOfPassengers = 3)
    val truck1 = AutoTruck(vehicleName = "MAN", realLoadWeight = 2000)

    car1.transportPassenger()
    car1.ride()
    car2.transportPassenger()
    car2.ride()
    truck1.transportLoad()
    truck1.transportPassenger()
    truck1.ride()
}

abstract class Vehicle(
    val vehicleName: String,
    val quantityOfPassengers: Int,
    val realLoadWeight: Int,
    val maxQuantityOfPassengers: Int,
    val maxLoadWeight: Int,
)

class PassengerCar(
    vehicleName: String,
    quantityOfPassengers: Int = 0,
    maxQuantityOfPassengers: Int = 3,
) : Vehicle(
    vehicleName,
    quantityOfPassengers,
    realLoadWeight = 0,
    maxQuantityOfPassengers,
    maxLoadWeight = 0,
), Movable, PassengerAcceptable {

    override fun ride() = println("Легковой автомобиль $vehicleName двигается по маршруту.")

    override fun transportPassenger() =
        println("Легковой автомобиль $vehicleName перевозит пассажиров: $quantityOfPassengers.")
}

class AutoTruck(
    vehicleName: String,
    quantityOfPassengers: Int = 0,
    realLoadWeight: Int = 0,
    maxQuantityOfPassengers: Int = 1,
    maxLoadWeight: Int = 2000,
) : Vehicle(
    vehicleName,
    quantityOfPassengers,
    realLoadWeight,
    maxQuantityOfPassengers,
    maxLoadWeight,
), Movable, PassengerAcceptable, LoadAcceptable {

    override fun ride() = println("Грузовик $vehicleName двигается по маршруту.")

    override fun transportPassenger() =
        println("Грузовик $vehicleName перевозит пассажиров: $quantityOfPassengers.")

    override fun transportLoad() = println("Грузовик $vehicleName переозит грузов: $realLoadWeight кг.")
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