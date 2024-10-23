package hw11092024

fun main() {
    val a: Int = 1
    val b: Int = 2
    val c: Int = 3
    if (a>b == true) {
        if (a>c == true) {
            println("a $a")
        }else {
            println("c $c")
        }
    }
    if (b>c == true) {
        println("b $b")
    }else {
        println("c $c")
    }
}