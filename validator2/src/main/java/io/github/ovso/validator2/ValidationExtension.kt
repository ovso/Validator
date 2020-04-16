package io.github.ovso.validator2

import android.content.Context
import java.util.regex.Pattern

fun String.isEmail(regex: String): Boolean {
    return Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(this).matches()
}

fun String.isVehicleNumber(context: Context): Boolean {
    val firstRegex = context.getString(R.string.car_regex1)
    val secondRegex = context.getString(R.string.car_regex2)
    val thirdRegex = context.getString(R.string.car_regex3)
    fun check(regex: String, vehicleNumber: String): Boolean {
        return Pattern.compile(regex).matcher(vehicleNumber).matches()
    }
    return when {
        check(firstRegex, this) -> true
        check(secondRegex, this) -> true
        else -> check(thirdRegex, this)
    }
}