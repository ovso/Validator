package io.github.ovso.validator2

import android.content.Context
import java.util.regex.Pattern

fun String.isEmail(context:Context): Boolean {
//    val emailRegex = context.getString(R.string.email_regex)
    val emailRegex = "^[\\w-+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})\$"
    return Pattern.compile(emailRegex).matcher(this).matches()
}

fun String.isVehicleNumber(context: Context): Boolean {
    val firstRegex = context.getString(R.string.car_regex1)
    val secondRegex = context.getString(R.string.car_regex2)
    val thirdRegex = context.getString(R.string.car_regex3)
//    val firstRegex = "^(\\\\d{2}|\\\\d{3})[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}/*\$"
//    val secondRegex = "^[서울|부산|대구|인천|대전|광주|울산|제주|경기|강원|충남|전남|전북|경남|경북|세종]{2}\\\\d{2}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}\$"
//    val thirdRegex = "^[서울|부산|대구|인천|대전|광주|울산|제주|경기|강원|충남|전남|전북|경남|경북|세종]{2}(\\\\d{2}|\\\\d{1})[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}\$"

    fun check(regex: String, vehicleNumber: String): Boolean {
        return Pattern.compile(regex).matcher(vehicleNumber).matches()
//        return vehicleNumber.matches(Regex(regex))
    }

    return when {
        check(firstRegex, this) -> true
        check(secondRegex, this) -> true
        else -> check(thirdRegex, this)
    }
}