package io.github.ovso.validator

import org.junit.Assert
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
        Assert.assertSame("41주8595".isVehicleNumber(), true)
        Assert.assertSame("부산27무6662".isVehicleNumber(), true)
        Assert.assertSame("서울1나6881".isVehicleNumber(), true)
        Assert.assertSame("02허9757".isVehicleNumber(), true)
        Assert.assertSame("서울31사9141".isVehicleNumber(), true)
        Assert.assertSame("서울01가1234".isVehicleNumber(), true)
        Assert.assertSame("123가1234".isVehicleNumber(), true)
        Assert.assertSame("대전50바4321".isVehicleNumber(), true)
        Assert.assertSame("38국4104".isVehicleNumber(), true)
        Assert.assertSame("38합4104".isVehicleNumber(), true)
        Assert.assertSame("38육4104".isVehicleNumber(), true)
        Assert.assertSame("38해4104".isVehicleNumber(), true)
        Assert.assertSame("38공4104".isVehicleNumber(), true)

    }
}
