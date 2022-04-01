fun main(args: Array<String>) {
    println("Hello World!")

    println(mockDisplayString("0123456789"))

    for (i in 0..10) {
        println(SegmentDisplay7.new(i.toString()).toMockDisplayString())
    }
}

fun mockDisplayString(value: String): String {
    val sb1 = StringBuilder()
    val sb2 = StringBuilder()
    val sb3 = StringBuilder()
    for (c in value) {
        when (c) {
            '0' -> { sb1.append(" _ "); sb2.append("| |"); sb3.append("|_|"); }
            '1' -> { sb1.append("   "); sb2.append("  |"); sb3.append("  |"); }
            '2' -> { sb1.append(" _ "); sb2.append(" _|"); sb3.append("|_ "); }
            '3' -> { sb1.append(" _ "); sb2.append(" _|"); sb3.append(" _|"); }
            '4' -> { sb1.append("   "); sb2.append("|_|"); sb3.append("  |"); }
            '5' -> { sb1.append(" _ "); sb2.append("|_ "); sb3.append(" _|"); }
            '6' -> { sb1.append(" _ "); sb2.append("|_ "); sb3.append("|_|"); }
            '7' -> { sb1.append(" _ "); sb2.append("  |"); sb3.append("  |"); }
            '8' -> { sb1.append(" _ "); sb2.append("|_|"); sb3.append("|_|"); }
            '9' -> { sb1.append(" _ "); sb2.append("|_|"); sb3.append("  |"); }
            ' ' -> { sb1.append(" _ "); sb2.append("|_|"); sb3.append("  |"); }
        }
    }
    return sb1.append("\n").append(sb2.toString()).append("\n").append(sb3.toString()).toString()
}
