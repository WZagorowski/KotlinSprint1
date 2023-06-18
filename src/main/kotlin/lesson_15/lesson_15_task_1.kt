package lesson_15

fun main() {

    val bird1 = Bird("Чайка")
    val bird2 = Bird("Утка")
    val fish1 = Fish("Карась")

    bird1.startFlying()
    bird1.fly()
    bird1.endFlying()
    bird1.swim()
    println()
    bird2.startFlying()
    bird2.fly()
    bird2.endFlying()
    bird2.swim()
    println()
    fish1.swim()
}

interface Flyable {

    fun startFlying() {
        println("Быстро махать крыльями, помогать лапами и взлетать вверх")
    }

    fun fly() {
        println("Медленно махать крыльями, контролировать направление и высоту")
    }

    fun endFlying() {
        println("Снижая скорость и высоту приземлиться на поверхность")
    }
}

interface Floatable {

    fun swim() {
        println("Двигая конечностями (лапами либо плавниками), двигаться вперед либо в сторону")
    }
}

class Bird(val name: String) : Flyable, Floatable

class Fish(val name: String) : Floatable