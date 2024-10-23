package hw02102024

fun main() {
    println(listSum(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}

fun listSum(a:List<Int>):Int {
    return a.sum()
}