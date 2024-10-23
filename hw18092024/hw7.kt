package hw18092024

fun main() {
    var count = 0
    val list = listOf(1, 2, 3, 4, 5, 11, 10, 14, 55, 78, 45)
    for (i in list) {
        if (i > 10) {
            count ++
        }
    }
    println(count)
}