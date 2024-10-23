package hw04092024
fun main() {
    val byteMax: Byte = Byte.MAX_VALUE
    val byteMin: Byte = Byte.MIN_VALUE
    val shortMax: Short = Short.MAX_VALUE
    val shortMin: Short = Short.MIN_VALUE
    val intMax: Int = Int.MAX_VALUE
    val intMin: Int = Int.MIN_VALUE
    val longMax: Long = Long.MAX_VALUE
    val longMin: Long = Long.MIN_VALUE
    val floatMax: Float = Float.MAX_VALUE
    val floatMin: Float = Float.MIN_VALUE
    val doubleMax: Double = Double.MAX_VALUE
    val doubleMin: Double = Double.MIN_VALUE
    val charMax: Char = Char.MAX_VALUE
    val charMin: Char = Char.MIN_VALUE
    val stringMaxMin: String = "More than one character"
    val booleanTrue: Boolean = true
    val booleanFalse: Boolean = false

    println("byte: $byteMax $byteMin" +
            " boolean: $booleanTrue $booleanFalse" +
            " short: $shortMax $shortMin" +
            " int: $intMax $intMin" +
            " long: $longMax $longMin" +
            " float: $floatMax $floatMin" +
            " double: $doubleMax $doubleMin" +
            " char: $charMax $charMin" +
            " string: $stringMaxMin")
}