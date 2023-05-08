package lesson_1
fun main(){
    val seconds = 6480
    val minutes = (seconds / 60)
    val modSeconds = (seconds % minutes).toDouble() / 100
    val modSecondsStr = String.format("%.2f", modSeconds)

    print("$minutes:" + modSecondsStr[2] + modSecondsStr[3])
}
