package lesson_4
fun main(){
    println("Укажите состояние корпуса (введите 'true' если повреждений нет либо незначительные, 'false' если есть)")
    val isShipConditionOk = readln().toBoolean()

    println("Текущая численность экипажа (введите число):")
    val isPersonalOk = readln().toInt() in 56..70

    println("Текущее количество ящиков провизии (введите число):")
    val isFoodOk = readln().toInt() > 50

    println("Благоприятные ли метеоусловия? (введите 'true' если благоприятные, 'false' если нет)")
    val isWeatherOk = readln().toBoolean()

    val result = isShipConditionOk && isPersonalOk && isFoodOk && isWeatherOk
    println("Условия для отправления корабля выполнены? $result")
}