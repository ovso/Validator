package io.github.ovso.validator

import org.junit.Test
import java.util.regex.Pattern

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@Suppress("NonAsciiCharacters")
class ValidationTest {


    @Test
    fun `차량 차대 번 유효성 검사`() {
//        assert("20너0821".isVehicleNumber())
        println(isValidCarNumber("20너0821"))
    }


    private fun isValidCarNumber(number: String?): Boolean {
        var returnValue = false
        try {
            var regex = "^[서울|부산|대구|인천|대전|광주|울산|제주|경기|강원|충남|전남|전북|경남|경북|세종]{2}\\\\d{2}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}\$"
            var p = Pattern.compile(regex)
            var m = p.matcher(number)
            if (m.matches()) {
                returnValue = true
            } else {
                regex = "^(\\\\d{2}|\\\\d{3})[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}/*\$"
                p = Pattern.compile(regex)
                m = p.matcher(number)
                if (m.matches()) {
                    returnValue = true
                } else {
                    regex = "^[서울|부산|대구|인천|대전|광주|울산|제주|경기|강원|충남|전남|전북|경남|경북|세종]{2}(\\\\d{2}|\\\\d{1})[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}\$"
                    p = Pattern.compile(regex)
                    m = p.matcher(number)
                    if (m.matches()) {
                        returnValue = true
                    }
                }
            }
            return returnValue
        } catch (e: Exception) {
            return false
        }

    }

}
