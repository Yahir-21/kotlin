fun main() {
    //Asks user for age and movie rating
    print("Enter the number of movie rating: ")
    var rating = readLine()
    print("Enter your age: ")
    var age = readLine()

    val R = 17
    val G = 1
    val Pg = 13

    //Decision structure

    when (rating == G) {
        if (age >= 13) {
            println("Yes, you are able to view the movie.")
        } else {
            println("No, you are not able to view the movie.")
        }
    }
    when (rating == R) {
        if (age >= 17) {
            println("Yes, you are able to view the movie.")
        } else {
            println("No, you are not able to view the movie.")
        }
    }
    when (rating == Pg) {
        if (age >= 13) {
            println("Yes, you are able to view the movie.")
        } else {
            println("No, you are not able to view the movie.")
        }
    }
}
