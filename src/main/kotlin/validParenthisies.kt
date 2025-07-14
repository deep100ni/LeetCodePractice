package org.example

fun isValid(s: String): Boolean {
    var valid = true
    var  stb = mutableListOf<Char>()
    for (b in s){
        if (b in listOf('(','[','{')){
            stb.add(b)
        }else{
            if ((b == ')' && stb.last() == '(') || (b == ']' &&  stb.last() == '[') || (b == '}' && stb.last() == '{')){
                stb.remove(stb.last())
            }else{
                valid = false
                stb.add(b)
                break;
            }
        }
    }
    if(stb.size == 0){
        valid = true
    }else{
        valid = false
    }
    return valid
}
fun main(){
    val s = "[({}){}()]"
    println(isValid(s))
}