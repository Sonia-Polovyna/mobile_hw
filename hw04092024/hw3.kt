package hw04092024

fun main() {
    val words: MutableList<String> = mutableListOf<String>("a", "b", "c", "d", "e")
    words.remove("a")
    words.add("x")
    println("$words")
}