class Vehicle(var make: String, var model: String, var year: Int) {
}
fun main() {
    val c1 = Vehicle(make = "Mustang", model =  "Mach1", year = 1969)

    println(c1.make)
    println(c1.model)
    println(c1.year)
}