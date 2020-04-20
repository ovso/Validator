package io.github.ovso.validator

import java.util.regex.Pattern

fun String.isPassword(): Boolean {

    val s = "(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{6,15})$".toRegex()
    return Pattern.compile("").matcher(this).matches()
}
fun String.isPassword2(): Boolean {
    val s = "(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{6,15})$".toRegex()
    return Pattern.compile("").matcher(this).matches()
}