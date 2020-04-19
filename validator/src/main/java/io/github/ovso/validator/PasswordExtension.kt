package io.github.ovso.validator

import java.util.regex.Pattern

fun String.isPassword(): Boolean {
    return Pattern.compile("").matcher(this).matches()
}