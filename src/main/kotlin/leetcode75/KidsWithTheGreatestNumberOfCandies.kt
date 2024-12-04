package leetcode75

/// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
class KidsWithTheGreatestNumberOfCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val maxCandies = candies.max()
        return candies.map { i -> i + extraCandies >= maxCandies }
    }
}