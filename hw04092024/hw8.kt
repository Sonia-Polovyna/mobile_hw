package hw04092024

fun main() {
   val words: MutableList<String> = mutableListOf("a", "b", "c", "d")
   words.add(0, "z")
   words.removeAt(words.size -1)
    println(words)
}