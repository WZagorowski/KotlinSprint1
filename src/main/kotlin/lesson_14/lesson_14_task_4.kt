package lesson_14

fun main() {

    val satellite11 = Satellite(
        "Moon",
        false,
        false,
        false,
        true,
    )

    val satellite12 = Satellite(
        "ISS",
        true,
        true,
        true,
        true,
    )

    val planet1 = Planet(
        "Earth",
        true,
        true,
        true,
        true,
        listOf(satellite11, satellite12),
    )

    planet1.printPlanetAndSatellitesNames()
}

open class SpaceObject(
    val objectName: String,
    val isItHabitable: Boolean,
    val isItHasAtmosphere: Boolean,
    val isItHasWater: Boolean,
    val isItAvailableForLanding: Boolean,
)

class Planet(
    objectName: String,
    isItHabitable: Boolean,
    isItHasAtmosphere: Boolean,
    isItHasWater: Boolean,
    isItAvailableForLanding: Boolean,
    val listOfSatellites: List<Satellite> = listOf(),
) : SpaceObject(objectName, isItHabitable, isItHasAtmosphere, isItHasWater, isItAvailableForLanding) {

    fun printPlanetAndSatellitesNames() {
        println("Planet \"${objectName}\" has satellites:")
        listOfSatellites.forEach { println(it.objectName) }
    }
}

class Satellite(
    objectName: String,
    isItHabitable: Boolean,
    isItHasAtmosphere: Boolean,
    isItHasWater: Boolean,
    isItAvailableForLanding: Boolean,
) : SpaceObject(objectName, isItHabitable, isItHasAtmosphere, isItHasWater, isItAvailableForLanding)