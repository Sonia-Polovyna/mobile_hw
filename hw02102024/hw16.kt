package hw02102024

fun main() {
    val b = "Cugc$ GIgg $555"
    println(count(b))
}

fun count(a:String):Int {
    var count = 0
    for (char in a) {
        if('$' == char) {
            count++
        }
    }
    return count
}