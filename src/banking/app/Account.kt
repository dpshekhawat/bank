package banking.app

open class Account (open var owner: String, open var balance: Int = 0){
    init {
        println("Welcome to Bankers Bank. We care for you.")
        println("Fetching your account details.....")
    }
    fun getAccountDetails() {
        println("Account Owner: $owner ")
        println("")
        println("Account Balance: $balance ")

    }
    fun depositAmount(amount: Int) {
        balance = balance + amount
        println("Thank you for banking with us. $amount has been deposited to your account.")
    }
    fun withdrawAmount(amount: Int) {
        if (amount>balance) {
            println("Insufficient funds.")
        } else {
            balance = balance - amount
            println("Thank you for banking with us. $amount has been withdrawn successfully from your account.")
        }
    }
}

