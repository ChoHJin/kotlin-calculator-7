package calculator

import camp.nextstep.edu.missionutils.Console.readLine

fun main() {
    // TODO: 프로그램 구현
    println("덧셈할 문자열을 입력해 주세요.")

    val inputString = readLine()

    val result = inputString.split(',', ':').sumOf { it.toInt() }

    println(result)
}
