package io.github.ovso.validator2

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class Test {

    @Test
    fun emailValidation() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("io.github.ovso.validator2.test", appContext.packageName)
    }
}
