/**
 * A 7-segment display.
 *
 *  _
 * |_|
 * |_|
 *
 *
 *  --
 * | |
 * --
 * | |
 * --
 */
data class SegmentDisplay7(
    var a: Boolean = false,
    var b: Boolean = false,
    var c: Boolean = false,
    var d: Boolean = false,
    var e: Boolean = false,
    var f: Boolean = false,
    var g: Boolean = false
) {

    fun toMockDisplayString(): String {
        val sb = StringBuilder()
        if (a) sb.append(" _ \n") else sb.append("   \n")
        if (f) sb.append("|") else sb.append(" ")
        if (g) sb.append("_") else sb.append(" ")
        if (b) sb.append("|\n") else sb.append(" \n")
        if (e) sb.append("|") else sb.append(" ")
        if (d) sb.append("_") else sb.append(" ")
        if (c) sb.append("|\n") else sb.append(" \n")
        return sb.toString()
    }

    companion object {
        val D0 = SegmentDisplay7(a = true, b = true, c = true, d = true, e = true, f = true)
        val D1 = SegmentDisplay7(b = true, c = true)
        val D2 = SegmentDisplay7(a = true, b = true, d = true, e = true, g = true)
        val D3 = SegmentDisplay7(a = true, b = true, c = true, d = true, g = true)
        val D4 = SegmentDisplay7(b = true, c = true, f = true, g = true)
        val D5 = SegmentDisplay7(a = true, c = true, d = true, f = true, g = true)
        val D6 = SegmentDisplay7(a = true, c = true, d = true, e = true, f = true, g = true)
        val D7 = SegmentDisplay7(a = true, b = true, c = true)
        val D8 = SegmentDisplay7(a = true, b = true, c = true, d = true, e = true, f = true, g = true)
        val D9 = SegmentDisplay7(a = true, b = true, c = true, d = true, f = true, g = true)
        val D_UNKNOWN = SegmentDisplay7()

        fun new(value: String): SegmentDisplay7 {
            return when (value) {
                "0" -> D0
                "1" -> D1
                "2" -> D2
                "3" -> D3
                "4" -> D4
                "5" -> D5
                "6" -> D6
                "7" -> D7
                "8" -> D8
                "9" -> D9
                else -> D_UNKNOWN
            }
        }
    }

}