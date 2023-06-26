package lesson_18

fun main() {
    val drawingScreen = Screen()

    val point1 = Point()
    val square1 = Square(side = 10.5f)
    val circle1 = Circle(radius = 5f)
    val point2 = Point()
    val square2 = Square(side = 8f)
    val circle2 = Circle(radius = 7.5f)

    drawingScreen.draw(x = 5, y = 3.5f, point1)
    drawingScreen.draw(x = 0.8f, y = 5, square1)
    drawingScreen.draw(x = 9.5f, y = 5.9f, circle1)
    println()
    drawingScreen.draw(x = 3.5f, y = 7, point2)
    drawingScreen.draw(x = 10, y = 5, square2)
    drawingScreen.draw(x = 9, y = 7, circle2)
}

private class Screen {

    fun draw(x: Int, y: Int, figure: BaseFigure) = println(figure.getDrawingMethod(x, y))
    fun draw(x: Float, y: Int, figure: BaseFigure) = println(figure.getDrawingMethod(x, y))
    fun draw(x: Float, y: Float, figure: BaseFigure) = println(figure.getDrawingMethod(x, y))
    fun draw(x: Int, y: Float, figure: BaseFigure) = println(figure.getDrawingMethod(x, y))
}

abstract class BaseFigure {

    abstract fun getDrawingMethod(x: Int, y: Int): String
    abstract fun getDrawingMethod(x: Float, y: Int): String
    abstract fun getDrawingMethod(x: Float, y: Float): String
    abstract fun getDrawingMethod(x: Int, y: Float): String
}

private class Point : BaseFigure() {

    override fun getDrawingMethod(x: Int, y: Int) = "Draw a point in coordinates (x:y) = $x:$y"

    override fun getDrawingMethod(x: Float, y: Int) = "Draw a point in coordinates (x:y) = $x:$y"

    override fun getDrawingMethod(x: Float, y: Float) = "Draw a point in coordinates (x:y) = $x:$y"

    override fun getDrawingMethod(x: Int, y: Float) = "Draw a point in coordinates (x:y) = $x:$y"
}

private class Square(private val side: Float) : BaseFigure() {

    override fun getDrawingMethod(x: Int, y: Int) =
        "Draw a square with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"

    override fun getDrawingMethod(x: Float, y: Int) =
        "Draw a square with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"

    override fun getDrawingMethod(x: Float, y: Float) =
        "Draw a square with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"

    override fun getDrawingMethod(x: Int, y: Float) =
        "Draw a square with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"
}

private class Circle(private val radius: Float) : BaseFigure() {

    override fun getDrawingMethod(x: Int, y: Int) =
        "Draw a circle with a radius = $radius and coordinates of the center (x:y) = $x:$y"

    override fun getDrawingMethod(x: Float, y: Int) =
        "Draw a circle with a radius = $radius and coordinates of the center (x:y) = $x:$y"

    override fun getDrawingMethod(x: Float, y: Float) =
        "Draw a circle with a radius = $radius and coordinates of the center (x:y) = $x:$y"

    override fun getDrawingMethod(x: Int, y: Float) =
        "Draw a circle with a radius = $radius and coordinates of the center (x:y) = $x:$y"
}