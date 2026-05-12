package template.routine

class MondaySchedule: DailyRoutine() {
    override fun beforeLunch() {
        println("Some pointless meeting")
        println("Code review. What this does?")
    }

    override fun afterLunch() {
        println("Meeting with Ralf")
        println("Telling jokes to other architects")
    }

    override fun drinkCoffee() {
        super.drinkCoffee()
        println("Drink another coffee")
    }

}