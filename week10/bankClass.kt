class BankAccount(var accountNumber: String, var Balance: Double, var ownerName: String) {
}
fun main() {
    val c1 = BankAccount(accountNumber = "4353", Balance =  "$2343.14", ownerName = "JohnDoe")

    println(c1.accountNumber)
    println(c1.Balance)
    println(c1.ownerName)
}