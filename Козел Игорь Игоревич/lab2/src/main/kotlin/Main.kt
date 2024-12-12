fun main() {
    val array = arrayOf(
        arrayOf(1.0, 2.0, 3.0),
        arrayOf(4.0, 5.0, 6.0),
        arrayOf(7.0, 8.0, 9.0)
    )

    val list = array.flatten()
    val average = calculateAverage(list)
    val median = calculateMedian(list)
    val variance = calculateVariance(list, average)

    println("Основные статистические показатели:")
    println("Среднее: $average")
    println("Медиана: $median")
    println("Дисперсия: $variance")
}

fun calculateAverage(list: List<Double>): Double {
    return list.sum() / list.size
}

fun calculateMedian(list: List<Double>): Double {
    val sortedData = list.sorted()
    val n = sortedData.size
    return if (n % 2 == 0) {
        (sortedData[n / 2 - 1] + sortedData[n / 2]) / 2
    } else {
        sortedData[n / 2]
    }
}

fun calculateVariance(list: List<Double>, average: Double): Double {
    val squaredDifferences = list.map { (it - average) * (it - average) }
    return squaredDifferences.sum() / list.size
}