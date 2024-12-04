import leetcode75.ReverseVowelsOfAString
import leetcode75.ReverseWordsInAString
import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val solution = ReverseWordsInAString()

    val s = input.next()
    println("Result: ${solution.reverseWords("a good   example")}")

//
//    do {
//        val s = input.next()
//        println("Result: ${solution.reverseWords(s)}")
//    } while (s != "exist")
}
