class Account {
    var clientName = ""
    var accountNumber = 0
    var balance = 0.0

    fun deposit(value: Double){
        println("-----------")
        println("deposit $value")
        balance += value
    }

    fun withdrawal(value: Double){
        println("-----------")
        println("withdrawal $value")
        if(balance < value){
            println("insufficient balance")
            return
        }
        balance -= value
    }

    fun transfer(value: Double, otherAcccount: Account): Boolean {
        println("-----------")
        if(balance < value){
            println("insufficient balance")
            return false
        }
        println("transfer initialization... from $clientName to ${otherAcccount.clientName}")
        balance -= value
        otherAcccount.deposit(value)
        println("transfer finished...")
        return true
    }

    fun checkBalance(){
        println("-----------")
        println("titular " + clientName)
        if(balance > 0.0 ){
            println("green balance")
        }

        when {
            balance > 0.0 -> {
                println("green balance(with when)")
            }
            balance == 0.0 -> {
                print("neutral balance")
            }
            else -> {
                print("red balance")
            }
        }
    }

    fun showDetails() {
        println("-----------")
        println("titular " + clientName)
        println("account number is $accountNumber")
        println("balance $balance")
    }
}

