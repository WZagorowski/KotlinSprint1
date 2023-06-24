package lesson_18

fun main() {

    val screen01 = Point()
    val screen02 = Square(side = 10.5f)
    val screen03 = Circle(radius = 5f)

    screen01.draw(5, 3.5f, POINT)
    screen02.draw(0.8f, 5, SQUARE)
    screen03.draw(9.5f, 5.9f, CIRCLE)
}

open class Screen {

    open fun draw(x: Int, y: Int, figure: String) {}
    open fun draw(x: Float, y: Int, figure: String) {}
    open fun draw(x: Float, y: Float, figure: String) {}
    open fun draw(x: Int, y: Float, figure: String) {}
}

private class Point : Screen() {

    override fun draw(x: Int, y: Int, figure: String) = println("Draw a $figure in coordinates (x:y) = $x:$y")
    override fun draw(x: Float, y: Int, figure: String) = println("Draw a $figure in coordinates (x:y) = $x:$y")
    override fun draw(x: Float, y: Float, figure: String) = println("Draw a $figure in coordinates (x:y) = $x:$y")
    override fun draw(x: Int, y: Float, figure: String) = println("Draw a $figure in coordinates (x:y) = $x:$y")
}

private class Square(private val side: Float) : Screen() {

    override fun draw(x: Int, y: Int, figure: String) = println(
        "Draw a $figure with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"
    )

    override fun draw(x: Float, y: Int, figure: String) = println(
        "Draw a $figure with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"
    )

    override fun draw(x: Float, y: Float, figure: String) = println(
        "Draw a $figure with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"
    )

    override fun draw(x: Int, y: Float, figure: String) = println(
        "Draw a $figure with four coordinates (x:y) = $x:$y, $x:${y + side}, ${x + side}:${y + side}, ${x + side}:$y"
    )
}

private class Circle(private val radius: Float) : Screen() {

    override fun draw(x: Int, y: Int, figure: String) = println(
        "Draw a $figure with a radius = $radius and coordinates of the center (x:y) = $x:$y"
    )

    override fun draw(x: Float, y: Int, figure: String) = println(
        "Draw a $figure with a radius = $radius and coordinates of the center (x:y) = $x:$y"
    )

    override fun draw(x: Float, y: Float, figure: String) = println(
        "Draw a $figure with a radius = $radius and coordinates of the center (x:y) = $x:$y"
    )

    override fun draw(x: Int, y: Float, figure: String) = println(
        "Draw a $figure with a radius = $radius and coordinates of the center (x:y) = $x:$y"
    )
}

const val POINT = "point"
const val SQUARE = "square"
const val CIRCLE = "circle"