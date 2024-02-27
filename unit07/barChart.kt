fun main() {
    //Code Below will ask for sales between 1 and 5
    var store1: Int? = null
    while (store1 == null) {
        print("Enter today's sales for store 1: ")
        val input = readLine()
        try {
            store1 = input?.toInt()
            if (store1 != null && store1 < 0) {
                println("Invalid input. Please enter a positive integer.")
                store1 = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    var store2: Int? = null
    while (store2 == null) {
        print("Enter today's sales for store 2: ")
        val input = readLine()
        try {
            store2 = input?.toInt()
            if (store2 != null && store2 < 0) {
                println("Invalid input. Please enter a positive integer.")
                store2 = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    var store3: Int? = null
    while (store3 == null) {
        print("Enter today's sales for store 3: ")
        val input = readLine()
        try {
            store3 = input?.toInt()
            if (store3 != null && store3 < 0) {
                println("Invalid input. Please enter a positive integer.")
                store3 = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    var store4: Int? = null
    while (store4 == null) {
        print("Enter today's sales for store 4: ")
        val input = readLine()
        try {
            store4 = input?.toInt()
            if (store4 != null && store4 < 0) {
                println("Invalid input. Please enter a positive integer.")
                store4 = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    var store5: Int? = null
    while (store5 == null) {
        print("Enter today's sales for store 5: ")
        val input = readLine()
        try {
            store5 = input?.toInt()
            if (store5 != null && store5 < 0) {
                println("Invalid input. Please enter a positive integer.")
                store5 = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    
    //Code Below will display all sales between store 1 and 5
    
    println()

    var sold1 = 0
    sold1 = store1 / 100
    println("Sales Bar Chart")
    println("Store 1")
    for (i in 1..sold1) {
        print("*")
    }

    println()

    var sold2 = 0
    sold2 = store2 / 100
    println("Store 2")
    for (i in 1..sold2) {
        print("*")
    }

    println()

    var sold3 = 0
    sold3 = store3 / 100
    println("Store 3")
    for (i in 1..sold3) {
        print("*")
    }

    println()

    var sold4 = 0
    sold4 = store4 / 100
    println("Store 4")
    for (i in 1..sold4) {
        print("*")
    }

    println()

    var sold5 = 0
    sold5 = store5 / 100
    println("Store 5")
    for (i in 1..sold5) {
        print("*")
    }
}