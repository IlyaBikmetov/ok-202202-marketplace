fun main() {
    val l = { a: Int -> a * a }

    println("sum: ${l.invoke(4)}")
}
