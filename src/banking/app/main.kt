package banking.app

fun buildAccount() {
    val acc = Account(owner = "Deependra Singh", balance = 0)
    acc.getAccountDetails()
    acc.depositAmount(200)
    acc.getAccountDetails()
    acc.withdrawAmount(20)
    acc.getAccountDetails()

}
fun main() {
    buildAccount()
}