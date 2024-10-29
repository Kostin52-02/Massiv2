fun main() {

    val array = arrayOf(
        intArrayOf(5, 9, 6, 7, 2),
        intArrayOf(9, 8, 4, 5, 3),
        intArrayOf(6, 4, 3, 8, 7),
        intArrayOf(7, 5, 8, 4, 8),
        intArrayOf(2, 3, 7, 8, 1)
    )

    val n = array.size
    var isSymmetric = true


    for (i in 0..<n) {
        for (j in 0..<n) {
            if (array[i][j] != array[j][i]) {
                isSymmetric = false
                break
            }
        }
        if (!isSymmetric) break
    }


    if (isSymmetric) {
        println("Массив является симметричным относительно главной диагонали")
    } else {
        println("Массив не является симметричным относительно главной диагонали")
    }
}
