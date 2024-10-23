package hw11092024

fun main() {
   val int: Int = 4
    if (int % 2 == 0) {
        val intstr: String = int.toString()
        println("$intstr")
    }else{
        val ints: Int = int + 1
        println("ints")
    }
}