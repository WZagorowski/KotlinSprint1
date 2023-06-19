package lesson_14

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val figure1 = Circle(RED, 5.5)
    val figure2 = Circle(BLACK, 2.5)
    val figure3 = Rectangle(GREEN, 18.0, 10.5)
    val figure4 = Rectangle(RED, 12.7, 7.4)
    val figure5 = Triangle(BLACK, 7.1, 4.4, 5.5)
    val figure6 = Triangle(RED, 12.3, 6.5, 7.2)
    val result1 = Result(listOf(figure1, figure2, figure3, figure4, figure5, figure6))

    val resultPerimeter1 = result1.getResultPerimeter(RED)
    val resultArea1 = result1.getResultArea(RED)

    println("Sum of the perimeters is " + "%.2f".format(resultPerimeter1))
    println("Sum of the areas is " + "%.2f".format(resultArea1))
}

abstract class Figure(val color: String) {

    abstract fun getAreaOfFigure(): Double
    abstract fun getPerimeterOfFigure(): Double
}

class Circle(color: String, private val radius: Double) : Figure(color) {

    override fun getAreaOfFigure() = PI * radius * radius
    override fun getPerimeterOfFigure() = 2 * PI * radius
}

class Rectangle(color: String, private val length: Double, private val width: Double) : Figure(color) {

    override fun getAreaOfFigure() = length * width
    override fun getPerimeterOfFigure() = (length + width) * 2
}

class Triangle(color: String, val sideOne: Double, val sideTwo: Double, val sideThree: Double) : Figure(color) {

    override fun getAreaOfFigure(): Double {
        val halfOfPerimeter = (sideOne + sideTwo + sideThree) / 2

        return sqrt(
            halfOfPerimeter * (halfOfPerimeter - sideOne) * (halfOfPerimeter - sideTwo) *
                    (halfOfPerimeter - sideThree)
        )
    }

    override fun getPerimeterOfFigure() = sideOne + sideTwo + sideThree
}

class Result(private val resultList: List<Figure>) {

    fun getResultPerimeter(anyColor: String): Double {
        var resultPerimeter = 0.0

        for (figure in resultList) {
            if (figure.color == anyColor)
                resultPerimeter += figure.getPerimeterOfFigure()
        }
        return resultPerimeter
    }

    fun getResultArea(anyColor: String): Double {
        var resultArea = 0.0

        for (figure in resultList) {
            if (figure.color == anyColor)
                resultArea += figure.getAreaOfFigure()
        }
        return resultArea
    }
}

const val RED = "red"
const val GREEN = "green"
const val BLACK = "black"