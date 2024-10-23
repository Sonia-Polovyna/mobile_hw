package hw18092024

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    var count = 0
    for (i in list) {
        if (i % 2 == 0) {
            count ++
        }
    }
    println(count)
}