class Microwave {

    var currentInput = ""
    var currentDisplay = "00:00"
    var timeLeft: Long = 0
    var isBlink: Boolean = false
    var status: Status = Status.WAITING

    fun press0() { pressNumber(0) }
    fun press1() { pressNumber(1) }
    fun press2() { pressNumber(2) }
    fun press3() { pressNumber(3) }
    fun press4() { pressNumber(4) }
    fun press5() { pressNumber(5) }
    fun press6() { pressNumber(6) }
    fun press7() { pressNumber(7) }
    fun press8() { pressNumber(8) }
    fun press9() { pressNumber(9) }

    private fun pressNumber(value: Int) {
        when (status) {
            Status.WAITING -> currentInput += value
            Status.SET_CLOCK -> currentInput += value
            Status.COOKING -> { /* Do nothing */ }
        }
    }

    fun pressStart() {
        when (status) {
            Status.WAITING -> TODO()
            Status.COOKING -> TODO()
            Status.SET_CLOCK -> TODO()
        }
    }
    fun pressStop() {
        when (status) {
            Status.WAITING -> TODO()
            Status.COOKING -> TODO()
            Status.SET_CLOCK -> TODO()
        }
    }

    fun pressQuickReheat30s() {
        when (status) {
            Status.WAITING -> TODO()
            Status.COOKING -> TODO()
            Status.SET_CLOCK -> TODO()
        }
    }

    fun pressClock() {
        if (status == Status.SET_CLOCK) {
            // TODO: Accept time if it's a valid format
            status = Status.WAITING
            isBlink = false
        } else {
            status = Status.SET_CLOCK
            currentInput = ""
            currentDisplay = "  :  "
            isBlink = true
        }
    }

    enum class Status {
        WAITING,
        COOKING,
        SET_CLOCK
    }

}
