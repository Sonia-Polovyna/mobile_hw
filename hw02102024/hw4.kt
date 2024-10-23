package hw02102024

import kotlin.math.pow

fun main() {
    println(pow(3.0,3))
}

fun pow(a:Double, b:Int):Int {
    return a.pow(b).toInt()
}