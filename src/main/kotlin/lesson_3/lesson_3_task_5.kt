package lesson_3

fun main(){
    val infoFromServer = "D2-D4;0"
    val goFrom = "${infoFromServer[0]}${infoFromServer[1]}"
    val goTo = "${infoFromServer[3]}${infoFromServer[4]}"
    val moveNumber = "${infoFromServer[6]}"
    println("$goFrom\n$goTo\n$moveNumber")
}