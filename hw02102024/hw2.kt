package hw02102024

fun main() {
    println(factorial(11))
}

fun factorial(a:Int):Int {
    return if(a==0) 1 else a * factorial(a-1)
}