package io.github.ovso.validator

import java.util.regex.Pattern

fun String.isEmail(): Boolean {
    val emailRegex = "^[\\w-+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"
    return Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE).matcher(this).matches()
}

fun String.isVehicleNumber(): Boolean {
    val firstRegex =
        "^(\\d{2}|\\d{3})[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}/*\$"
    val secondRegex =
        "^[서울|부산|대구|인천|대전|광주|울산|제주|경기|강원|충남|전남|전북|경남|경북|세종]{2}\\\\d{2}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}\$"
    val thirdRegex =
        "^[서울|부산|대구|인천|대전|광주|울산|제주|경기|강원|충남|전남|전북|경남|경북|세종]{2}(\\\\d{2}|\\\\d{1})[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하\\\\x20]\\\\d{4}\$"

    fun check(regex: String, vehicleNumber: String): Boolean {
        return Pattern.compile(regex, Pattern.UNICODE_CASE).matcher(vehicleNumber).matches()
    }

    if (check(firstRegex, this)) return true
    if (check(secondRegex, this)) return true
    if (check(thirdRegex, this)) return true

    return false
/*
    return when {
        check(firstRegex, this) -> true
        check(secondRegex, this) -> true
        else -> check(thirdRegex, this)
    }
*/
}