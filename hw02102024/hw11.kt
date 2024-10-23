package hw02102024

fun main() {
    val text = "scjsl vlsdvbv ilvhv vbdojvbo jvbdjad "
    println(countText(text))
}

fun countText(text:String):Int{
    var isword = false
    var count = 0
    for (char in text){
        if (char != ' '){
            isword = true
        }
        if (!isword){
            count++
        }else {
            isword = false
        }
    }
    return count
}