package leetcode75

/// https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
class ReverseVowelsOfAString {
    fun reverseVowels(s: String): String {
        val vowels = "aeiouAEIOU"
        val chars = s.toCharArray()

        var vowelsIndexArray = intArrayOf()
        for (i in chars.indices) {
            if (vowels.contains(chars[i])) {
                vowelsIndexArray += i
            }
        }

        val reversedVowelsIndexArray = vowelsIndexArray.reversedArray()

        for (i in vowelsIndexArray.indices) {
            chars[vowelsIndexArray[i]] = s[reversedVowelsIndexArray[i]]
        }
        return chars.joinToString("")
    }

//    fun reverseVowels(s: String): String {
//        val chars = s.toCharArray()
//        var i = 0
//        var j = chars.size - 1
//
//        while (i < j) {
//            val start = chars[i]
//            val end = chars[j]
//
//            val isStartVowel = isVowel(start)
//            val isEndVowel = isVowel(end)
//
//            if (!isVowel(start)) {
//                i++
//            }
//
//            if (!isVowel(end)) {
//                j--
//            }
//
//            if (isStartVowel && isEndVowel) {
//                chars[i] = end
//                chars[j] = start
//                i++
//                j--
//            }
//        }
//
//        return String(chars)
//    }
//
//    private fun isVowel(char: Char) = char == 'a' || char == 'A' || char == 'e' || char == 'E' || char == 'i' || char == 'I' || char == 'o' || char == 'O' || char == 'u' || char == 'U'
}