package io.github.ovso.validator

import org.junit.Test
import java.util.*

class TMTest {

    @Test
    fun solution() {
        val a = "penpineapple"
        val b = "applepen"

        val bf = StringBuffer()
        val list = ArrayList<String>()

        for (i in a.indices) {
            for (j in i until a.length) {
                bf.append(a[j])
                if (!b.contains(bf)) {
                    bf.delete(j - i, j - i + 1)
                    break
                }
            }
            list.add(bf.toString())
            bf.delete(0, a.length)
        }

        var count = 0
        for (i in list.indices) {
            if (list[i].length >= count) {
                count = list[i].length
            }
        }
        println(count)
        for (i in list.indices) {
            if (list[i].length == count) {
                println(list[i])
            }
        }

    }

    @Test
    fun solution2() {
        val num = 10
        var tmp = 0
        var divisor = 0
        var dividend = 0
        for (i in 1..9999) {
            if (num > tmp && tmp + i >= num) {
                if (i % 2 == 0) {
                    divisor = i + 1 - (num - tmp)
                    dividend = num - tmp
                } else {
                    divisor = num - tmp
                    dividend = i + 1 - (num - tmp)
                }
                break
            }
            tmp += i
        }
        print("$dividend/$divisor")
    }

}