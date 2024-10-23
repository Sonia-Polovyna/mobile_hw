package hw02102024

fun main() {
    val l = listOf('a', 'b', 'c')
    println(rev(l))
}

fun rev(list:List<Char>):List<Char> {
    return list.reversed()
}