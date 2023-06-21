package lesson_17

private class Quiz {

    var question: String = ""
        set(value) {
            field = value
        }

    var answer: String = ""
        get() = field
        set(value) {
            field = value
        }
}