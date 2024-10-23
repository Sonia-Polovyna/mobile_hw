package hw11092024

fun main() {
    val letter: Char = 'e'
    when(letter) {
        'a', 'e', 'y', 'u', 'i', 'o' -> println("H")
        'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' -> println("P")
    }
}