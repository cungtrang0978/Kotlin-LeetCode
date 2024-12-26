package leetcode75

class StringCompression {
    fun compress(chars: CharArray): Int {
        if (chars.isEmpty()) return 0

        var char: Char? = null
        var count = 0
        var newCharSize = 0

        for (i in chars.indices) {
            if (chars[i] != char) {
                if (char != null && count > 1) {
                    if (count < 10) {
                        chars[newCharSize++] = count.digitToChar()
                    } else {
                        val countArray = count.toString().toCharArray()
                        for (j in countArray.indices) {
                            chars[newCharSize++] = countArray[j]
                        }
                    }

                }

                char = chars[i]
                chars[newCharSize++] = char
                count = 0

            }

            count++

        }

        if (count > 1) {
            if (count < 10) {
                chars[newCharSize++] = count.digitToChar()
            } else {
                val countArray = count.toString().toCharArray()
                for (j in countArray.indices) {
                    chars[newCharSize++] = countArray[j]
                }
            }
        }

        return newCharSize

    }
}