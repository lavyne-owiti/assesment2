fun main(){
var bank=CurrentAccount("Lavyne Owiti",2333556677,800088.25)
     bank.deposit(20000.50)
    bank.withdraw(100000.98)
    bank.details()
    var bankSavings=Savings("Zimpila",1237890345,60000.56,5)
    bankSavings.withdraw(2000.89)
    var sample=Product("apple",12.5,50.25,"friut")
    var sample1=Product("apple",12.5,50.25,"friut")
   var sample2=Product("apple",12.5,50.25,"friut")
    var sample3=Product("apple",12.5,50.25,"friut")
    var allsample= listOf(sample,sample1,sample2,sample3)
  // var samples=allsample.filter { product -> product.category:String }
  // println(samples)
    evenStrings("bananas")


}
open class CurrentAccount(var accountName:String,var accountNumber:Long,var balance:Double){
    fun deposit(amount:Double){
      var sum = balance+amount
        println(sum)

    }
   open fun withdraw(amount:Double){
       var sub = balance-amount
        println(sub)

    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName.")
    }
}
class Savings( accountName:String, accountNumber:Long, balance:Double,var withdrawals:Int):CurrentAccount(accountName,accountNumber,balance){
   override fun withdraw(amount: Double){
       var z=1
           if (withdrawals<4){
               z+=withdrawals
               println(z)
           }
   else{
       println("Withdrawal amount is maximum")
   }
       }
}

data class Product(var name:String,var weight:Double,var price:Double,var category:String)



fun evenStrings(names:String):String{
    names.forEachIndexed { index, name ->
        if (index % 2==0)
            println(name.toString())
    }
    return names
}