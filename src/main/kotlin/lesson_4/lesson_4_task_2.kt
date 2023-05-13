package lesson_4

fun main(){
    val minWeight = 35
    val maxWeight = 100
    val maxSize = 100

    val firstWeight = 20
    val firstSize = 80
    val secondWeight = 42
    val secondSize = 120
    val isFirstAverage = firstWeight >= minWeight && firstWeight <= maxWeight && firstSize < maxSize
    val isSecondAverage = secondWeight >= minWeight && secondWeight <= maxWeight && secondSize < maxSize
    println("Average для груза с весом $firstWeight кг и объемом $firstSize л: $isFirstAverage")
    println("Average для груза с весом $secondWeight кг и объемом $secondSize л: $isSecondAverage")
}