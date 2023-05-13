package lesson_4
fun main(){
    println("Введите день тренировки")
    val trainingDay = readLine()?.toIntOrNull()

    if (trainingDay == null) println("Введите число: 1, 2, 3 ...")
    else {
        val isItEvenNumber = trainingDay % 2 == 0
        println("""
            |Упражнения для рук:    ${!isItEvenNumber}
            |Упражнения для ног:    $isItEvenNumber
            |Упражнения для спины:  $isItEvenNumber
            |Упражнения для пресса: ${!isItEvenNumber}
            """.trimMargin())
    }
}