class MicrowaveHardware(
    var isDoorClosed: Boolean = true
) {

    fun doorStatus() = if (isDoorClosed) "closed" else "open"

}