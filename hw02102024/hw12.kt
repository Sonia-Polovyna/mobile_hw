package hw02102024

fun main() {
    println(g(2024))
}

fun g(year:Int):Boolean {
    return if(year % 4 == 0) true else false
}

