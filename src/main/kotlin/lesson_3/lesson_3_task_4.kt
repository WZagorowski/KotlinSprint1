package lesson_3

fun  main() {
    var goFrom = "E2"
    var goTo = "E4"
    var moveNumber = 1

    println("$goFrom-$goTo;$moveNumber")
    goFrom = "D2"
    goTo = "D${2+1}"
    moveNumber += 1
    println("$goFrom-$goTo;$moveNumber")
}