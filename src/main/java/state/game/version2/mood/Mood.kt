package state.game.version2.mood

import state.game.version2.WhatCanHappen

sealed class Mood: WhatCanHappen {
    abstract fun description(): String
}