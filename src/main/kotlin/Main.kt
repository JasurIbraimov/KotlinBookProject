
const val HERO_NAME = "Madrigal";

fun main() {
    println("The hero announces her presence to the world")
    println(HERO_NAME)
    var playerLevel = 4
    val playerClass = "paladin"
    val hasBeFriendedBarbarians = true
    val hasAngeredBarbarians = false
    println("She has level: $playerLevel")
    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
    println("She has level up to $playerLevel")

    println("The hero looks up to bounty board and sees: ")

    val quest = when(playerLevel) {
        1 -> "Meet Mr. Bubbles in Sweet kingdom"
        in 2..5 -> {
            if(!hasAngeredBarbarians && (hasBeFriendedBarbarians || playerClass == "barbarian")) {
                "Talk to barbarians to prevent war!"
            } else "Defend the city from barbarians invasions"
        }
        6 -> "Find enchanted sword!"
        7 -> "Defeat a <WorldEater>, a giant worm"
        8 -> "Build a house to your villages"
        else -> "No quest available yet"
    }

    println(quest)

    /*
    // Exercise 1
    var hasSteed = false

    if (hasSteed) {
        println("She has a mount")
    } else {
        println("She has not a mount")
    }

    // Exercise 2
    val tavernName = "Unicorn horn"
    val tavernKeeperName = "Tavern keeper"
    var coins = 50
    val drinks = listOf("Honey", "Wine", "Beer")
    println("The hero arrived to the tavern <$tavernName>. $tavernKeeperName asks:")
    println("<Do you need a stable?>")
    if(!hasSteed) {
        println("<No> - she answers, - <i don't have a mount. But I have $coins coins and I want to drink>")
    }
    println("<Great!> - $tavernKeeperName says. - <I can offer you $drinks. What do you want?>")

    // Exercise 3
    println("$HERO_NAME meets a <Magic Mirror>. She looks into the mirror and sees: ")
    println(HERO_NAME.reversed())
    */
}