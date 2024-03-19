fun main(){

    val g =9.8
    var t = 1

    var counter = 1
    while (counter <= 10) {
        var d = 0.5 * (g * (t * t))
        println("At $t seconds the distance is $d.")
        t++
        counter++
    }

}