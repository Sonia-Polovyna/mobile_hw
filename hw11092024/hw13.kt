package hw11092024

fun main() {
    val int: Int = 35
    if (int % 3 == 0) {
        println("Fizz")
    }
    if (int % 5 == 0) {
        println("Buzz")
    }
    if ((int % 3 == 0) and (int % 5 == 0)) {
        println("FizzBuzz")
    }
    if ((int % 3 != 0) and (int % 5 != 0)) {
        println("$int")
    }
}