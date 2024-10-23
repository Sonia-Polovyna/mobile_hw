package hw18092024

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 50, 8, 9, 10)
    for (i in list) {
       if ( i >= 50)
           break
        println(i)
    }
}