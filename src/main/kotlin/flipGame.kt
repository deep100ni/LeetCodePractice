package org.example

fun flipGame(str : String) : List<String>{
    val n = str.length
    var res = mutableListOf<String>()
    for (i in 0 .. n-2){
        if (str[i] == '+' && str[i + 1] == '+'){
            var newString = ""
            for (j in 0 until i) {
                newString += str[j]
            }
            newString += "--"
            for (j in i + 2 until str.length) {
                newString += str[j]
            }
            res.add(newString)
        }
    }
    return res
}
fun main(){
    val str = "++++"
    println(flipGame(str))
}