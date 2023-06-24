package lesson_19

fun main() {

    println("Список рыбок, доступных для добавления в аквариум:")
    for (i in Fish.values()) println(i.getFishName())
}

enum class Fish {

    GUPPY {
        override fun getFishName() = "Гуппи"
    },

    ANGELFISH {
        override fun getFishName() = "Скалярия"
    },

    GOLDFISH {
        override fun getFishName() = "Золотая рыбка"
    },

    SIAMESE_FIGHTING_FISH {
        override fun getFishName() = "Петушок"
    };

    abstract fun getFishName(): String
}