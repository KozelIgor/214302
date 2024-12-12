fun main() {
    print("Введите математическое выражение (формат: 1 + 1): ")
    val input = readLine()
    if (input.isNullOrEmpty()) {
        println("Пустой ввод!")
        return
    }
    val mathTask = input.split(" ")
    if (mathTask.size != 3) {
        println("Неверный формат!")
        return
    }
    val op1 = mathTask[0].toDoubleOrNull()
    val operator = mathTask[1]
    val op2 = mathTask[2].toDoubleOrNull()
    if (op1 == null || op2 == null) {
        println("Ошибка с числами!")
        return
    }
    val operation: (Double, Double) -> Double = when (operator) {
        "+" -> { a, b -> a + b }
        "-" -> { a, b -> a - b }
        "*" -> { a, b -> a * b }
        "/" -> { a, b -> if (b != 0.0) a / b else throw ArithmeticException("Ошибка деления на ноль!") }
        else -> {
            println("Ошибка с оператором!")
            return
        }
    }
    val result = operation(op1, op2)
    println("Результат: $result")
}