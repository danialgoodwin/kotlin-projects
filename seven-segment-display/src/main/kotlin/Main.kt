fun main(args: Array<String>) {
    println("Hello World!")

    println(mockDisplayString("01234 = 56789-720 42"))
    println(mockDisplayString("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))

//    for (i in 0..10) {
//        println(SegmentDisplay7.new(i.toString()).toMockDisplayString())
//    }
}

fun mockDisplayString(value: String): String {
    val sb1 = StringBuilder()
    val sb2 = StringBuilder()
    val sb3 = StringBuilder()
    for (c in value) {
        when (c) {
            '0', 'D', 'O', 'Q' -> { sb1.append(" _ "); sb2.append("| |"); sb3.append("|_|"); }
            '1', 'I' -> { sb1.append("   "); sb2.append("  |"); sb3.append("  |"); }
            '2', 'Z' -> { sb1.append(" _ "); sb2.append(" _|"); sb3.append("|_ "); }
            '3', 'W' -> { sb1.append(" _ "); sb2.append(" _|"); sb3.append(" _|"); }
            '4', 'Y' -> { sb1.append("   "); sb2.append("|_|"); sb3.append("  |"); }
            '5', 'S' -> { sb1.append(" _ "); sb2.append("|_ "); sb3.append(" _|"); }
            '6', 'G' -> { sb1.append(" _ "); sb2.append("|_ "); sb3.append("|_|"); }
            '7' -> { sb1.append(" _ "); sb2.append("  |"); sb3.append("  |"); }
            '8', 'B' -> { sb1.append(" _ "); sb2.append("|_|"); sb3.append("|_|"); }
            '9' -> { sb1.append(" _ "); sb2.append("|_|"); sb3.append("  |"); }
            ' ' -> { sb1.append("   "); sb2.append("   "); sb3.append("   "); }
            '-' -> { sb1.append("   "); sb2.append("___"); sb3.append("   "); }
            '=' -> { sb1.append("   "); sb2.append("---"); sb3.append("---"); }
            'A', 'R' -> { sb1.append(" _ "); sb2.append("|_|"); sb3.append("| |"); }
            'C' -> { sb1.append(" _ "); sb2.append("|  "); sb3.append("|_ "); }
            'E', 'M' -> { sb1.append(" _ "); sb2.append("|_ "); sb3.append("|_ "); }
            'F' -> { sb1.append(" _ "); sb2.append("|_ "); sb3.append("|  "); }
            'H', 'K', 'X' -> { sb1.append("   "); sb2.append("|_|"); sb3.append("| |"); }
            'J' -> { sb1.append("   "); sb2.append("  |"); sb3.append("|_|"); }
            'L' -> { sb1.append("   "); sb2.append("|  "); sb3.append("|_ "); }
            'N' -> { sb1.append(" _ "); sb2.append("| |"); sb3.append("| |"); }
            'P' -> { sb1.append(" _ "); sb2.append("|_|"); sb3.append("|  "); }
            'T' -> { sb1.append(" _ "); sb2.append("  |"); sb3.append("  |"); }
            'U', 'V' -> { sb1.append("   "); sb2.append("| |"); sb3.append("|_|"); }
            else -> { sb1.append("###"); sb2.append("###"); sb3.append("###"); }
        }
    }
    return sb1.append("\n").append(sb2.toString()).append("\n").append(sb3.toString()).toString()
}
