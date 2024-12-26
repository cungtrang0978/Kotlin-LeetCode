package leetcode75

/// https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
class ProductOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val answer = IntArray(n) { 1 }

        // Calculate prefix products
        var prefix = 1
        for (i in 0 until  n) {
            answer[i] = prefix
            prefix *= nums[i]
        }

        // Calculate suffix products and combine
        var suffix = 1
        for (i in n - 1 downTo  0) {
            answer[i] *= suffix
            suffix *= nums[i]
        }

        return answer
    }
}