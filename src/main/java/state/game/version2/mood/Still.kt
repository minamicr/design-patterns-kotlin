package state.game.version2.mood

import state.game.version2.Snail

class Still(private val snail: Snail): Mood() {
    override fun seeHero() {
        println("The hero is here")
        snail.mood = Agressive(snail)
        println("My mood is ${snail.mood.description()}")
    }

    override fun getHit(pointsOfDamage: Int) {
        println("I've been hit of $pointsOfDamage")
        snail.healthPoints -= pointsOfDamage
        snail.mood = when {
            (snail.healthPoints <= 0) -> Dead(snail)
            (snail.mood is Agressive) -> Retreating(snail)
            else -> snail.mood
        }
        println("My mood is ${snail.mood.description()}")

    }

    override fun calmAgain() {
        println("I'm calm again")
        snail.mood = Still(snail)
        println("My mood is ${snail.mood.description()}")
    }

    override fun description() = "Still"
}