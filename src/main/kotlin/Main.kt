import leetcode75.*
import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val solution = StringCompression()


//    // Input the size of the array
//    print("Enter the number of elements: ")
//    val n = input.nextInt()
//
//    // Create an array to store the integers
//    val arr = IntArray(n)
//
//    // Input array elements
//    println("Enter $n integers:")
//    for (i in 0 until n) {
//        arr[i] = input.nextInt()
//    }
//
    val s =
        "[\"a\",\"a\",\"a\",\"a\",\"a\",\"a\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"b\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\",\"c\"]"
    println("Result: ${solution.compress(stringToCharArray(s))}")
//    println("Result: ${solution.compress(charArrayOf('a'))}")


}

fun stringToCharArray(s: String): CharArray {
    var newS = s.replace("[", "")
    newS = newS.replace("]", "")
    newS = newS.replace(",", "")
    newS = newS.replace("\"", "")
    return newS.toCharArray()
}
