package hw02102024

fun main() {
    println(average(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
}

fun average(list: List<Int>):Int {
    return list.average().toInt()
}