package `02_02-01`

import java.math.BigInteger

fun doWork(number: Int): BigInteger {
    // 1*2*3*4...*number
    var factorial = BigInteger.ONE
    for (i in 1..number) {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    println("Calculated factorial of $number")
    return factorial
}

fun doOtherWork() {
    println("Now I can do something else.")
}


fun main() {
    println("Start")

    println("Prepare stuff")
    doWork(50000)

    doOtherWork()
}