package lesson_11

fun main() {

    val room1 = Room(
        cover = "image111",
        name = "Барса",
        membersAvatars = listOf("Image1001", "Image1002", "Image 1003", "Image 1004"),
    )

    val room2 = Room(
        cover = "image112",
        name = "Реал",
        membersAvatars = listOf("Image2001", "Image2002", "Image 2003"),
    )
}

class Room(
    val cover: String,
    val name: String,
    val membersAvatars: List<String>,
    ) {

    fun tapToMemberAvatar(memberAvatar: String) {
        println("Показать никнейм пользователя $memberAvatar")
        showMemberStatus()
    }

    private fun showMemberStatus() {
        val memberStatus = when (getRandomStatus()) {
            0 -> "разговаривает"
            1 -> "микрофон выключен"
            else -> "пользователь заглушен"
        }
        println("Статус: $memberStatus")
    }

    private fun getRandomStatus(): Int = (0..2).random()

}