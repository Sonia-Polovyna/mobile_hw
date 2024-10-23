package hw04092024

fun main() {
    val letters: List<Char> = listOf('h', 'e', 'l', 'l', 'o')
    val word = letters.joinToString(separator = "")
    println(word)
}