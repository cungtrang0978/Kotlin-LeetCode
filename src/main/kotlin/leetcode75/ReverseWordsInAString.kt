package leetcode75

/// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
class ReverseWordsInAString {
//    fun reverseWords(s: String): String {
//        val words = mutableListOf<String>()
//
//        var word = charArrayOf()
//
//        for (c in s) {
//            if (c != ' ') word += c
//            else if (word.isNotEmpty()) {
//                words.add(word.joinToString(""))
//                word = charArrayOf()
//            }
//        }
//
//        if(word.isNotEmpty()){
//            words.add(word.joinToString(""))
//        }
//
//        return words.reversed().joinToString(" ")
//    }

    fun reverseWords(s: String): String {
        val ch = s.toCharArray()

        fun reverse(start: Int, end: Int) {
            var l = start
            var r = end
            while (l < r) {
                ch[l] = ch[r].also { ch[r] = ch[l] }
                l++
                r--
            }
        }

        reverse(0, ch.size - 1)

        var start = 0
        var end = 0
        var index = 0

        while (end < ch.size) {
            while (end < ch.size && ch[end] != ' ') end++
            reverse(start, end - 1)
            if (start < end) {
                if (index > 0) ch[index++] = ' '
                for (i in start..end) ch[index++] = ch[i]
            }
            end++
            start = end
        }

        return String(ch, 0, index)
    }
}