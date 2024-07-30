package third.kot

fun main() {
    var money = 600
    val food = if (money > 500) {
        money -= 500
        "пицца"
    } else if (money > 200) {
        money -= 200
        "шаурма"
    } else {
        money -= 30
        "доширак"
    }
    println("Денег $money")
    println("Еда ${food.length}")

    val a : Boolean = true
    if (true) {
        println("true")
    } else {
        println("false")
    }
}