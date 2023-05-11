package lesson_4
fun main(){
    println("Введите день тренировки")
    val trainingDay = readLine()?.toIntOrNull()

    if (trainingDay == null) println("Введите число: 1, 2, 3 ...")
    else {
        println("""
            |Упражнения для рук:    ${trainingDay % 2 == 1}
            |Упражнения для ног:    ${trainingDay % 2 == 0}
            |Упражнения для спины:  ${trainingDay % 2 == 0}
            |Упражнения для пресса: ${trainingDay % 2 == 1}
            """.trimMargin())
    }
}