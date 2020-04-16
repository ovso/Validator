package io.github.ovso.validator2

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@Suppress("NonAsciiCharacters")
@RunWith(AndroidJUnit4::class)
class VehicleNumberTest {
    @Test
    fun `carValidatorTest`() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("io.github.ovso.validator2.test", appContext.packageName)
        assertSame("41주8595".isVehicleNumber(appContext), true)
        assertSame("부산27무6662".isVehicleNumber(appContext), true)
        assertSame("서울1나6881".isVehicleNumber(appContext), true)
        assertSame("02허9757".isVehicleNumber(appContext), true)
        assertSame("서울31사9141".isVehicleNumber(appContext), true)
        assertSame("서울01가1234".isVehicleNumber(appContext), true)
        assertSame("123가1234".isVehicleNumber(appContext), true)
        assertSame("대전50바4321".isVehicleNumber(appContext), true)
        assertSame("38국4104".isVehicleNumber(appContext), true)
        assertSame("38합4104".isVehicleNumber(appContext), true)
        assertSame("38육4104".isVehicleNumber(appContext), true)
        assertSame("38해4104".isVehicleNumber(appContext), true)
        assertSame("38공4104".isVehicleNumber(appContext), true)
    }
}
