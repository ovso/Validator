@file:Suppress("NonAsciiCharacters")

package io.github.ovso.validator

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RRNTest {

    @Test
    fun `주민번호 유효성 검사`() {
        println("820601-1384218".isRRN())
        println("820601-2384218".isRRN())
        println("820601-3384218".isRRN())
        println("820601-4384218".isRRN())
        println("820601-5384218".isRRN())
        println("820601-6384218".isRRN())
        println("820601-7384218".isRRN())
        println("820601-8384218".isRRN())
    }
}
