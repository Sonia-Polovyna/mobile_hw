package hw04092024

fun main() {
    val words:List<String> = listOf("a", "ab", "abc", "abcd", "abcde")
    val longWords = mutableListOf<String>()
    for (i in words) {
        if (i.length>3) {
            longWords.add(i)
        }
    }
    println("$longWords")
}