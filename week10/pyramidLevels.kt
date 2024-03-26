fun main() {
    print("Enter the number of pyramid levels: ")
    var levels = readLine()

    if (levels <= 0) {
        print("Please enter a positive number.")
    }

    var levelcounter = 1

    while (levelcounter <= levels) {
        var star = "**"


        var starCounter = 1

        while (starCounter <= levelcounter) {
            star = star + "*"
            starCounter++
        }

        print(star)

        levelcounter++
    }
}
