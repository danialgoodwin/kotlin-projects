fun main(args: Array<String>) {
    runMicrowaveApp(MicrowaveHardware())
}

fun runMicrowaveApp(hardware: MicrowaveHardware) {
    val mw = Microwave()
    while (true) {
        println("\nDisplay: ${mw.currentDisplay} (status: ${mw.status}, door: ${hardware.doorStatus()})")
        println("Options: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, start, stop, clock")
        print("Input: ")
        when(readln()) {
            "q", "exit" -> return
            "0" -> mw.press0()
            "1" -> mw.press1()
            "2" -> mw.press2()
            "3" -> mw.press3()
            "4" -> mw.press4()
            "5" -> mw.press5()
            "6" -> mw.press6()
            "7" -> mw.press7()
            "8" -> mw.press8()
            "9" -> mw.press9()
            "start" -> mw.pressStart()
            "stop" -> mw.pressStop()
            "clock" -> mw.pressClock()
            else -> println("Unknown input. Please try again.")
        }
    }
}
