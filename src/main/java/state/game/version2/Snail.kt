package state.game.version2

import state.game.version2.mood.Mood
import state.game.version2.mood.Still

class Snail {
    internal var healthPoints = 10
    internal var mood: Mood = Still(this)
}