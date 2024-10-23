package hw04092024

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sum = 0
    for (i in numbers) {
        sum += i
    }
    val moda = sum / numbers.size
    println("$sum and $moda")
}