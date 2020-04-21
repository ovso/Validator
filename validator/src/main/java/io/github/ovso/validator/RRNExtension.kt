package io.github.ovso.validator

// 외국인까지 포함해야 한다. 하지만 6으로 시작하는 번호는 유효성 체크에 실패하고 있다
fun String.isRRN(): Boolean {
    var inputRrn = this
    inputRrn = inputRrn.replace(" ", "")
    inputRrn = inputRrn.replace("-", "")
    if (inputRrn.count() != 13) return false


    var sum = 0
    inputRrn.forEachIndexed { index, char ->
        val number = char.toString().toIntOrNull() ?: return false
        if (index < inputRrn.count()) {
            sum += number * ((index % 8) + 2)
        }
    }
    return (((11 - (sum % 11)) % 10).toString()) != ((inputRrn[inputRrn.count() - 1]).toString())
}