package io.github.ovso.validator2

import java.util.regex.Pattern

fun String.isEmail(regex: String): Boolean {
    return Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(this).matches()
}

fun String.isEmail(): Boolean {
    val regex = "^[\\w-+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"
    return Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(this).matches()
}