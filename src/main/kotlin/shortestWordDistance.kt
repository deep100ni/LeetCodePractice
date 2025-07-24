package org.example

fun shortestDistance(wordsDict: List<String>, word1: String, word2: String): Int {
    var index1 = -1
    var index2 = -1
    var minDistance = wordsDict.size

    for (i in wordsDict.indices) {
        if (wordsDict[i] == word1) {
            index1 = i
        } else if (wordsDict[i] == word2) {
            index2 = i
        }
    }

    return minDistance
}
fun main() {
    val words = listOf("practice", "makes", "perfect", "coding", "makes")
    println(shortestDistance(words, "coding", "practice"))
    println(shortestDistance(words, "makes", "coding"))
}
