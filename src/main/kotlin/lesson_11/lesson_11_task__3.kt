package lesson_11

fun main() {

    val member001 = Room.Member("001.jpg","Messi",)
    val member002 = Room.Member("002.jpg", "Alba",)
    val member003 = Room.Member("003.jpg", "Dembele",)

    val member101 = Room.Member("101.jpg", "Benzema",)
    val member102 = Room.Member("102.jpg", "Modric",)

    val room1 = Room(
        cover = "image111",
        name = "Барса",
        members = mutableListOf(member001,member002,member003),
    )

    val room2 = Room(
        cover = "image112",
        name = "Реал",
        members = mutableListOf(member101,member102),
    )

    room1.showMembersInTheRoom()
    member001.tapToMemberAvatar()
    member002.tapToMemberAvatar()
    member003.tapToMemberAvatar()
}

private class Room(
    val cover: String,
    val name: String,
    val members: MutableList<Member>,
    ) {

    fun showMembersInTheRoom() {
        println("В комнате \"$name\" видим картинки пользователей:")
        for (member in members)
            println(member.memberAvatar)
    }

    class Member (
        val memberAvatar: String,
        val memberName: String,
    ) {

        fun tapToMemberAvatar() {
            println("\nНажали на картинку пользователя $memberAvatar -> его никнейм: $memberName")
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
}