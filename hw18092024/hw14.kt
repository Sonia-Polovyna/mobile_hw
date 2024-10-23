package hw18092024

fun main() {
    val list:MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 ..<list.size) {
        val value = list[i]
        val result = value * value
        println(result)
    }
}