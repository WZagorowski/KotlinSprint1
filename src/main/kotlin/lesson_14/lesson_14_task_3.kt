package lesson_14

fun main() {

    val topicAboutFootball = Topic(
        "Пеп Гвардиола",
        "Поздравляю всех болельщиков с победой в АПЛ и ЛЧ!",
    )

    val comment1 = Comment(
        "Эрлинг Холланд",
        "Первый сезон в клубе и сразу требл!",
        topicAboutFootball,
    )

    topicAboutFootball.publishNewTopic()
    println()
    comment1.showComment()
}

open class Topic(
    val creatorName: String,
    val textMessage: String,
) {

    fun publishNewTopic() {
        println("Пользователь $creatorName опубликовал пост: $textMessage")
    }
}

class Comment(creatorName: String, textMessage: String, private val topic: Topic) : Topic(creatorName, textMessage) {

    fun showComment() {
        println(
            """
            Пользователь $creatorName написал комментарий: $textMessage
            к следующему посту:
            "${topic.creatorName}: ${topic.textMessage}"
            """.trimIndent()
        )
    }
}
