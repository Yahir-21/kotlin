//Group Members: Yahir Estrada and Munachiso 
fun main() {
    
    //Code Below will ask for number greater than 0.
    
    var total = 0
    var userInput: Int? = null
    while (userInput == null) {
        print("Enter a positive integer: ")
        val input = readLine()
        try {
            userInput = input?.toInt()
            if (userInput != null && userInput < 1) {
                println("Invalid input. Please enter a positive integer.")
                userInput = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    
    //Code Below will display chosen number and addition of 1 between chosen number.
    
    println("You entered $userInput.")
    
    
    println()
    
    for (i in 1..userInput) {
        total = total + i
    }
    
    println("The sum of the number is: $total")
}