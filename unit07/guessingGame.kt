import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 10)
    var guess = 0
    var attempts = 0

    println("I chose a number between 1 and 10. Whats your guess? :")

    do {
        guess = readLine()?.toIntOrNull() ?: continue
        attempts++

        when {
            guess < randomNumber -> println("Too low, try again.")
            guess > randomNumber -> println("Too high, try again.")
            else -> println("Congratulations! You've guessed the number $randomNumber in $attempts attempts!")
        }
    } while (guess != randomNumber)
}