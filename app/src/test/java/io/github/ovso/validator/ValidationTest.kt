package io.github.ovso.validator

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ValidationTest {


    @Test
    fun `차량 차대 번 유효성 검사`() {
        assertTrue("20너0821".isVehicleNumber())
    }
}
