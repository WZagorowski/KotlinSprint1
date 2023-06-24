package lesson_18

fun main() {

    val box01 = RectangularBox(25.3, 15.4, 11.2)
    val box02 = CubicBox(10.3)

    println("Площадь поверхности = %.2f".format(box01.getSurfaceArea()))
    println("Площадь поверхности = %.2f".format(box02.getSurfaceArea()))
}

abstract class BaseBox {

    abstract fun getSurfaceArea(): Double
}

class RectangularBox(
    private val sideOne: Double,
    private val sideTwo: Double,
    private val sideThree: Double,
) : BaseBox() {

    override fun getSurfaceArea(): Double = 2 * (sideOne * sideTwo + sideTwo * sideThree + sideThree * sideOne)
}

class CubicBox(private val side: Double) : BaseBox() {

    override fun getSurfaceArea(): Double = side * side * 6
}