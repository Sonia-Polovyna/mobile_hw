package hw02102024

fun main() {
    println(vowel("Kotlin"))
}

fun vowel(text:String):Int {
    var count = 0
    for (char in text) {
        if('o' == char || 'i' == char || 'y' == char) {
            count++
        }
    }
    return count
}