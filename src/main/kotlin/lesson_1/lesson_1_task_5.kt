package lesson_1
fun main(){
    val seconds = 6480
    val minutes = (seconds / 60)
    val modSeconds = (seconds % 60)
    if (modSeconds < 10) {
        println("$minutes:0$modSeconds")
    } else {
        println("$minutes:$modSeconds")
    }
}
