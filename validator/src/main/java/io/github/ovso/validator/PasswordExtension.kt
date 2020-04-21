package io.github.ovso.validator

import java.util.regex.Pattern

fun String.isPassword(level: PasswordLevel): Boolean {
    return Pattern.compile("(?-i)(?=^.{8,}$)((?!.*s)(?=.*[A-Z])(?=.*[a-z]))(?=(1)(?=.*d)|.*[^A-Za-z0-9])^.*$")
        .matcher(this).matches()
}

/**
 * STRONG는
 */
enum class PasswordLevel {
    STRONG, NORMAL, EASY
}