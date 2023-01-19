fun main() {
    val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)
    var i = 0
    while ( i < numbers.size) {
        var multipliziert3 = numbers.get(i)  * 3.0
        numbers[i]= multipliziert3
i++
    }

    println(numbers)
}
