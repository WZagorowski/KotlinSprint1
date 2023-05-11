package lesson_1
fun main(){
    val seconds = 6480
    val minutes = seconds / 60
    val modSeconds = seconds % 60
    val modSecondsStr = String.format("$minutes:%02d", modSeconds)
    println(modSecondsStr)
}