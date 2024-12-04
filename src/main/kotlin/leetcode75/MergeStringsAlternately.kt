package leetcode75

/// https://leetcode.com/problems/merge-strings-alternately
class MergeStringsAlternately {

    fun mergeAlternately(word1: String, word2: String): String {
        if (word1.length == word2.length) {
            var result = ""

            for (i in word1.indices) {
                result += "${word1[i]}${word2[i]}"
            }
            return result
        }

        val equalLength = if (word1.length > word2.length) word2.length else word1.length

        val newWord1 = word1.substring(0, equalLength)
        val newWord2 = word2.substring(0, equalLength)

        val rest = if (word1.length > word2.length) word1.substring(equalLength) else word2.substring(equalLength)

        return mergeAlternately(newWord1, newWord2) + rest
    }

}