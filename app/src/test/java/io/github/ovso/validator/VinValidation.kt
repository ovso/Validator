package io.github.ovso.validator

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class VinValidation {



    @Test
    fun `차량 차대 번 유효성 검사`() {
        println("41주8595".isVPN())
    }
}
