fun arithmeticTriplets(a: IntArray, d: Int): Int {
    var c = 0
    for (i in a.indices) {
        for (j in i + 1..a.lastIndex) {
            if (a[j] - a[i] == d && a.filterIndexed { k, n -> k > j && n - a[j] == d }.isNotEmpty()) ++c
        }
    }
    return c
}
