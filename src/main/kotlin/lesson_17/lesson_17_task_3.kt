package lesson_17

fun main() {

    val folder18 = Folder(name = "Movie 43", numberOfFiles = 58, isFolderSecret = true)
    println(folder18.name)
    println(folder18.numberOfFiles)
}

private class Folder(name: String, numberOfFiles: Int, val isFolderSecret: Boolean = false) {

    val name = name
        get() {
            return if (!isFolderSecret) {
                field
            } else
                "Скрытая папка"
        }

    val numberOfFiles = numberOfFiles
        get() {
            return if (!isFolderSecret) {
                field
            } else
                0
        }
}