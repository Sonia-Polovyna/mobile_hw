package hw02102024

fun main() {
     println(p("mom"))
}

fun p(text: String):Boolean {
    return text == text.reversed()
}