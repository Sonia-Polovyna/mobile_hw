package hw11092024

fun main() {
    val str: String = "Kvvklhrgrb"
    val charstr: Char = str[0].toChar()
    if (charstr.isUpperCase()) {
        println("big letter")
    }
    if (charstr.isLowerCase()) {
        println("small letter")
    }
}