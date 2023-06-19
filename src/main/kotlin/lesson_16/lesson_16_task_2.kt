package lesson_16

fun main() {

    val circle61 = Circle6(0.9)

    println("Perimeter of circle is " + "%.2f".format(circle61.getPerimeter()))
    println("Area of circle is " + "%.2f".format(circle61.getArea()))
}

private class Circle6(protected val radius: Double) {

    private val pi = 3.14

    fun getArea() = pi * radius * radius
    fun getPerimeter() = 2 * pi * radius
}

