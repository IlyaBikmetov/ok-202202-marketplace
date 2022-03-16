fun cout(block: () -> Any?) {
    val result = block()
    println("result: $result")
}
class MyContext {
    fun time() = System.currentTimeMillis()
}
fun coutWithTimestamp(block: MyContext.() -> Any?) {
    val context = MyContext()
    val result = block(context)
    println(result)
}

fun String.wordCount(c: Char) : Int{
    var count = 0
    for(n in this){
        if(n == c) count++
    }
    return count
}
fun Int.square(): Int{
    return this * this
}

fun main() {
    val hello: String = "hello world"
    println(hello.wordCount('l'))

}