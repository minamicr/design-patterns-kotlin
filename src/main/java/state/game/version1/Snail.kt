package state.game.version1

import state.game.version1.mood.Agressive
import state.game.version1.mood.Dead
import state.game.version1.mood.Mood
import state.game.version1.mood.Retreating
import state.game.version1.mood.Still

class Snail: WhatCanHappen {
    private var healthPoints = 10
    private var mood: Mood = Still

    override fun seeHero() {
        println("The hero is here")
        mood = when(mood) {
            is Still -> Agressive
            else -> mood
        }
        println("My mood is $mood")
    }

    override fun getHit(pointsOfDamage: Int) {
        println("I've been hit of $pointsOfDamage")
        healthPoints -= pointsOfDamage
        mood = when {
            (healthPoints <= 0) -> Dead
            mood is Agressive -> Retreating
            else -> mood
        }
        println("My mood is $mood")
    }

    override fun calmAgain() {
        println("I'm calm again")
        mood = Still
        println("My mood is $mood")
    }
}