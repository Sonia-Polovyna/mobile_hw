package hw18092024

fun main() {
    val text = "      Hello my friend !!!"
    var count = 0
    for (i in text){
        if (i == ' ') {
            count++
        }
    }
    println(count)
}