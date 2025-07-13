package org.example

fun isValid(s: String): Boolean {
    var valid = true
    for (t in s){
        if(t in listOf('(','[','{')){
            for (l in s){
                if (l in listOf(')',']','}')){
                    valid = true
                }else{
                    valid = false
                }
            }
        }else{
            valid = true
        }
    }
    return valid
}
fun main(){
    val s = "[][}"
    println(isValid(s))
}