package second.kot

fun main() {
    val first: String? = "null"
    val second: String? = null
    val third: String? = "null"
    val lengthFirst = first?.length?:0
    val lengthSecond =second?.length?:0
    val lengthThird = third?.length?:0
    val result = lengthFirst + lengthSecond + lengthThird
    println(result)
}