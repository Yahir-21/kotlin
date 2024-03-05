fun main() {
    var sale1: Int? = null
    while (sale1 == null) {
        print("Enter the item's wholesale cost: ")
        val input = readLine()
        try {
            sale1 = input?.toInt()
            if (sale1 != null && sale1 < 0) {
                println("Invalid input. Please enter a positive integer.")
                sale1 = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    var markup1: Int? = null
    while (markup1 == null) {
        print("Enter the item's markup percentage: ")
        val input = readLine()
        try {
            markup1 = input?.toInt()
            if (markup1 != null && markup1 < 0) {
                println("Invalid input. Please enter a positive integer.")
                markup1 = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    fun calculateRetail() {
        var percent = markup1/100
        var total = sale1*percent
        var retailP = sale1+total
        println("The retail price on the item is: $retailP")
    }
    print(calculateRetail())
}