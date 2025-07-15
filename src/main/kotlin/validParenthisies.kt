package org.example

fun isValid(s: String): Boolean {
    var valid = true
    var stb = mutableListOf<Char>()
    for (b in s) {
        if (b in listOf('(', '[', '{')) {
            stb.add(b)
        } else {
            if (stb.isNotEmpty() &&
                ((b == ')' && stb.last() == '(') ||
                        (b == ']' && stb.last() == '[') ||
                        (b == '}' && stb.last() == '{'))) {
                stb.remove(stb.last())
            } else {
                valid = false
                stb.add(b)
                break
            }
        }
    }
    return valid && stb.isEmpty()
}

fun main() {
    val s = "]"
    println(isValid(s))
}
