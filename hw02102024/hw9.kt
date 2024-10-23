package hw02102024

fun main() {
    println(listOfChars("hello"))
}

fun listOfChars(text:String):List<Char> {
    return text.toList()
}