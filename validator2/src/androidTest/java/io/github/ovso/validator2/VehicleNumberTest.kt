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
    }
}
