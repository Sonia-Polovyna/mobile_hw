package hw04092024
fun main() {
    val numbers: List<Int> = listOf(1 ,2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers: MutableList<Int> = mutableListOf<Int>()
    for (i in numbers) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }
    println("$evenNumbers")
}
