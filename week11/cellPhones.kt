class CellPhones(var brand: String, var model: String, var price: Int) {
}
fun main() {
    val c1 = CellPhones(brand = "Samsung", model =  "Galaxy S24", price = 799)
    val c2 = CellPhones(brand = "Apple", model =  "iPhone 14", price = 1200)

    println(c1.brand)
    println(c1.model)
    println(c1.price)
    println(c2.brand)
    println(c2.model)
    println(c2.price)
}