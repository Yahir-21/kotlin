class Car(var brand: String, var model: String, var year: Int) {
    fun drive() {
        println("Wrooom!")
    }
}

fun main() {
    val c1 = Car(brand: "Ford", model: "Mustang", year: 1969)
    val c2 = Car(brand: "BMW", model: "X5", year: 1999)
    val c3 = Car(brand: "Tesla", model: "Model S", year: 2020)

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c1.brand)
    println(c2.brand)
    println(c3.brand)

    println(c3.brand)
    c1.drive()
}