package io.github.ovso.validator

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CodingTest {


    // 메쉬코리아 2번째 문제
    @Test
    fun solution() {
        val arr = arrayOf(2, 4, 8, 16, 32)
        val arrCount = arr.count()
        println("arrCount = $arrCount")
        val result = isPower(arr)

        println(result.joinToString("\n"))

    }

    fun isPower(arr: Array<Int>): Array<Int> {
        arr.forEachIndexed { index, value ->
            arr[index] = if (value != 0 && value and value - 1 == 0) 1 else 0
        }
        return arr
    }

    fun main(args: Array<String>) {
        val arrCount = args.count()
        println("arrCount = $arrCount")
        val arr = Array(arrCount, { 0 })
        for (i in 0 until arrCount) {
            arr[i] = i
        }

        val result = isPower(arr)

        println(result.joinToString("\n"))
    }

}