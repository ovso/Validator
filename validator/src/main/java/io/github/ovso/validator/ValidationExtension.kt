package io.github.ovso.validator

import java.util.regex.Pattern

private const val EMAIL_REGEX =
    "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"

fun String.isEmail(): Boolean {
    return Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE).matcher(this).matches()
}