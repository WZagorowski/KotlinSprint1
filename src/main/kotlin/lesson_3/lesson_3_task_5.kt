package lesson_3

fun main(){
    val infoFromServer = "D2-D4;0"

    val newInfo = infoFromServer.replace(";","-")
    val result = newInfo.split("-")
    val goFrom = result[0]
    val goTo = result[1]
    val moveNumber = result[2]
    println("$goFrom\n$goTo\n$moveNumber")
}