
fun main(){

    println("hello world")
    val account = Account()
    account.clientName = "Rodrigo"
    account.accountNumber = 1000
    account.balance = 0.0

    account.deposit(2.0)
    account.deposit(200.0)

    account.showDetails()

    account.withdrawal(30.0)

    account.showDetails()

    account.checkBalance()

    val accountReceiver = Account()
    accountReceiver.clientName = "Axley"
    accountReceiver.accountNumber = 555
    accountReceiver.balance = 500.0

    account.transfer(50.0, accountReceiver)
    account.showDetails()
    accountReceiver.showDetails()

    for(index in 1..5){
        println("$index")
        if(index == 4) {
            break
        }
    }

    println("for with step")
    for(index in 5 downTo 1 step 2){
        println("$index")
    }

    println("for with goto")
    loop@ for (indexOne in 1..100) {
        println("indexOne $indexOne")
        for (indexTwo in indexOne..100) {
            println("indexTwo $indexTwo")
            if (indexTwo == 5) break@loop
        }
    }
}

