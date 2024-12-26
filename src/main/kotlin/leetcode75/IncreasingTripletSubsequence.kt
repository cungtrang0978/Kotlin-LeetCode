package leetcode75

class IncreasingTripletSubsequence {

    fun increasingTriplet(nums: IntArray): Boolean {
        for (i in 1 until nums.size - 1) {
            val prev = nums[i - 1]
            val cur = nums[i]
            val next = nums[i + 1]
            if (cur in (prev + 1) until next) {
                return true
            }
        }

        return false
    }
}