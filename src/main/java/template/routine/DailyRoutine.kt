package template.routine

abstract class DailyRoutine {
    private fun arriveToWork() {
        println("Hi boss! I appear in the office sometimes")
    }

    open fun drinkCoffee() {
        println("Coffee is delicious today")
    }

    private fun goToLunch() {
        println("Hamburguer and chips, please!")
    }

    private fun goHome() {
        println("Leave quiet for no one noticing")
    }

    abstract fun beforeLunch()
    abstract fun afterLunch()

    fun runSchedule() {
        arriveToWork()
        drinkCoffee()
        beforeLunch()
        goToLunch()
        afterLunch()
        goHome()
    }

}