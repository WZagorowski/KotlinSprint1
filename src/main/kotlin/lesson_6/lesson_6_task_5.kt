package lesson_6

fun  main() {

    var counter = 3

    while (counter > 0) {

        val numberOne = (1..9).random()
        val numberTwo = (1..9).random()

        println("Введите сумму чисел $numberOne и $numberTwo")

        if (readln() == (numberOne + numberTwo).toString()) {
            println("Добро пожаловать!")
            break
        }
        else if (counter > 1)
            println("Ошибка! Попробуйте еще раз. Осталось попыток: ${--counter}")

        else {
            println("Доступ запрещен!")
            break
        }
    }
}