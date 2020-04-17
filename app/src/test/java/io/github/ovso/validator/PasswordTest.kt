package io.github.ovso.validator

import org.junit.Test
import java.util.regex.Matcher
import java.util.regex.Pattern

class PasswordTest {
    @Test
    fun solution() {
        val arrPw =
            arrayOf("qwer1234", "Qwer1234", "qwer!234", "Qwer!234")

        // 비밀번호 유효성 검사식1 : 숫자, 특수문자가 포함되어야 한다.

        // 비밀번호 유효성 검사식1 : 숫자, 특수문자가 포함되어야 한다.
        val regExp_symbol = "([0-9].*[!,@,#,^,&,*,(,)])|([!,@,#,^,&,*,(,)].*[0-9])"
        // 비밀번호 유효성 검사식2 : 영문자 대소문자가 적어도 하나씩은 포함되어야 한다.
        // 비밀번호 유효성 검사식2 : 영문자 대소문자가 적어도 하나씩은 포함되어야 한다.
        val regExp_alpha = "([a-z].*[A-Z])|([A-Z].*[a-z])"

        // 정규표현식 컴파일

        // 정규표현식 컴파일
        val pattern_symbol: Pattern = Pattern.compile(regExp_symbol)
        val pattern_alpha: Pattern = Pattern.compile(regExp_alpha)


        for (i in arrPw.indices) {
            // 문자 매칭
            val matcher_symbol: Matcher = pattern_symbol.matcher(arrPw[i])
            val matcher_alpha: Matcher = pattern_alpha.matcher(arrPw[i])

            // 매칭 결과 출력
            println("========== " + (i + 1) + "번째 비밀번호 : [" + arrPw[i] + "] ==========")
            if (matcher_symbol.find() && matcher_alpha.find()) {
                println("비밀번호로 적절합니다.")
            } else {
                println("비밀번호로 부적절합니다.")
            }
            println()
        }

    }

    @Test
    fun solution2() {
        val regex =
            "(?=([a-zA-Z].*[0-9].*[^0-9a-zA-Z].*)|([a-zA-Z].*[^0-9a-zA-Z].*[0-9].*)|([0-9].*[a-zA-Z].*[^0-9a-zA-Z].*)|([0-9].*[^0-9a-zA-Z].*[a-zA-Z].*)|([^0-9a-zA-Z].*[a-zA-Z].*[0-9].*)|([^0-9a-zA-Z].*[0-9].*[a-zA-Z].*)$).{9,16}"
        val compile =
            Pattern.compile(regex)
        println("Qwer!2".matches(Regex(regex)))
    }
}