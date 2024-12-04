package leetcode75

/// https://leetcode.com/problems/greatest-common-divisor-of-strings
class GreatestCommonDivisorOfString {
    private fun gcd(a: Int, b: Int): Int {
        var newA = a
        var newB = b

        while (newB > 0) {
            val temp = newB
            newB = newA % newB // % is remainder

            newA = temp
        }
        return newA
    }

    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1 + str2 != str2 + str1) return ""
        return str1.substring(0, gcd(str1.length, str2.length))
    }
}