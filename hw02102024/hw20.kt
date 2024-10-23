package hw02102024

fun main() {
    println(gcd(6, 9))
}

fun gcd(num1:Int, num2:Int):Int {
    var a = num1
    var b = num2
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    return a
}