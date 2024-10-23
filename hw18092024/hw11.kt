package hw18092024

fun main() {
    val text = "Hello World"
    val letters = "eyuioa"
    var count = 0
    for (i in text) {
        if (i == 'a' || i == 'o' || i == 'i' || i == 'e' || i == 'u' || i == 'y') {
            count ++
        }
        if (letters.contains(i) == true) {

        }
    }
    println(count)
}