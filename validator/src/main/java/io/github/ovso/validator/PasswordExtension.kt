package io.github.ovso.validator

import java.util.regex.Pattern

fun String.isPassword(): Boolean {
    val regex = "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{9,12}$"
    return Pattern.compile(regex).matcher(this).find()
}