package state.game.version2

import state.game.version2.mood.Still

fun main() {
    val snail = Snail()
    val still = Still(snail)

    still.seeHero()
    still.getHit(200)
    still.calmAgain()
}