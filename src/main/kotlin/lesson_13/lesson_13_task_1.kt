package lesson_13

fun main() {
}

class PhoneContact1(val name: String, val phoneNumber: Long) {

    private var company: String = ""

    constructor(name: String, phoneNumber: Long, company: String) : this(name, phoneNumber) {

        this.company = company
    }
}