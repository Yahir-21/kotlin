// VarAndVal/Task1.kt
package varAndValExercise1

import localfunctions.first

fun main() {
  // TODO


    val first = "Yahir"
    val last = "Estrada"
    var age = 16

    println("Hello, World! My name is $first $last, and I'm $age years old.")
    println("Did I tell you that mmy first name is $first?")
    age = age - 5
    println("And would you believe I'm $age years old?")

    println("What day is it today? ")
    val day = readLine()!!
    println(day)
}