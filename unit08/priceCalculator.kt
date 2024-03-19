fun main() {
    //Asks user for wholesale cost
    println("Enter the wholesale cost:")
    val wholesaleCost = readLine()?.toDoubleOrNull()
    if (wholesaleCost == null || wholesaleCost < 0) {
        println("Invalid input. Please enter a valid positive number.")
        return
    }
    //Asks user for markup percentage
    println("Enter the markup percentage:")
    val markupPercentage = readLine()?.toDoubleOrNull()
    if (markupPercentage == null || markupPercentage < 0) {
        println("Invalid input. Please enter a valid positive number.")
        return
    }
    //Calculates the retail price with the given info by user
    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)
    println("The item's retail price is: $retailPrice")
}
//Function below is the calculator for the retail price
fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    //Formula: retail price = wholesale cost + (wholesale cost + markup percentage / 100)
    return wholesaleCost + (wholesaleCost + markupPercentage / 100)

}