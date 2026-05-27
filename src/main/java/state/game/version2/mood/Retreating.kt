package state.game.version2.mood

import state.game.version2.Snail

class Retreating(private val snail: Snail): Mood() {
    override fun seeHero() {
        TODO("Not yet implemented")
    }

    override fun getHit(pointsOfDamage: Int) {
        TODO("Not yet implemented")
    }

    override fun calmAgain() {
        TODO("Not yet implemented")
    }

    override fun description() = "Retreating"

}