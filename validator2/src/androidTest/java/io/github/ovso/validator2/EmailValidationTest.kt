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
class EmailValidationTest {

    // list of valid email addresses
    private val validEmailIds = arrayOf(
        "ovsoce@yahoo.com",
        "ovsoce-100@yahoo.com",
        "ovsoce.100@yahoo.com",
        "ovsoce111@ovsoce.com",
        "ovsoce-100@ovsoce.net",
        "ovsoce.100@ovsoce.com.au",
        "ovsoce@1.com",
        "ovsoce@gmail.com.com",
        "ovsoce+100@gmail.com",
        "ovsoce-100@yahoo-test.com",
        "ovsoce_100@yahoo-test.ABC.CoM"
    )

    // list of invalid email addresses
    private val invalidEmailIds = arrayOf(
        "ovsoce",
        "ovsoce@.com.my",
        "ovsoce123@gmail.a",
        "ovsoce123@.com",
        "ovsoce123@.com.com",
        ".ovsoce@ovsoce.com",
        "ovsoce()*@gmail.com",
        "ovsoce@%*.com",
        "ovsoce..2002@gmail.com",
        "ovsoce.@gmail.com",
        "ovsoce@ovsoce@gmail.com",
        "ovsoce@gmail.com.1a"
    )


    @Test
    fun emailValidation() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("io.github.ovso.validator2.test", appContext.packageName)
        val emailRegex = appContext.getString(R.string.email_regex)
        validEmailIds.forEach {
            assertEquals(it.isEmail(emailRegex), true)
        }

        invalidEmailIds.forEach {
            assertEquals(it.isEmail(emailRegex), false)
        }

    }
}
