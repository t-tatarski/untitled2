import java.util.*

fun main(args: Array<String>) {
  print("range of numbers")
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    println(" $a ")

    


}

fun getFactorial(a: Int): Long {
    var factorial: Long = 1
    for (i in 1..a) {
        factorial *= i.toLong()
    }
    return factorial
}


