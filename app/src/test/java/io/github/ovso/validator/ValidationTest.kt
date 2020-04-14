package io.github.ovso.validator

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@Suppress("NonAsciiCharacters")
class ValidationTest {


    @Test
    fun `차량 차대 번 유효성 검사`() {
        assert("20너0821".isVehicleNumber())
    }
}
