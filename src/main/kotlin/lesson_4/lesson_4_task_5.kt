package lesson_4
fun main(){
    println("Есть ли повреждения корпуса? (да/нет/незначительные)")
    val shipCondition = readLine()
    val isShipConditionOk = shipCondition == "нет" || shipCondition == "незначительные"

    println("Текущая численность экипажа (введите число):")
    val isPersonalOk = readLine()!!.toInt() in 56..70

    println("Текущее количество ящиков провизии (введите число):")
    val isFoodOk = readLine()!!.toInt() > 50

    println("Благоприятные ли метеоусловия? (да/нет)")
    val isWeatherOk = readLine() == "да"

    val result = isShipConditionOk && isPersonalOk && isFoodOk && isWeatherOk
    println("Условия для отправления корабля выполнены? $result")
}