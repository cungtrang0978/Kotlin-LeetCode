package leetcode75

/// https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = n
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 1) continue
            val isPreviousEmptyOrNull = if (i - 1 >= 0) flowerbed[i - 1] == 0 else true
            val isNextEmptyOrNull = if (i + 1 <= flowerbed.size - 1) flowerbed[i + 1] == 0 else true

            if (isPreviousEmptyOrNull && isNextEmptyOrNull) {
                flowerbed[i] = 1
                count--
            }
        }

        return count <= 0

    }
}