
object MyClass {
    def main(args: Array[String]):Unit ={
        val acc1=new Account("988581682v",0001,12000)
        val acc2=new Account("893245774v",0002,1000)
        val acc3=new Account("898334555v",0003,9046)
        val acc4=new Account("898334555v",0004,200)
        var bank:List[Account]=List(acc1,acc2,acc3,acc4)
        
        def printAc(b:List[Account]) = b.foreach(x=>println(x.toString))
        println("before the transactions : \n");printAc(bank)
        acc1.withdraw(3500)   //withdraw 3500 from acc1
        acc2.deposit(20000)   //deposit 20000 to acc2
        acc3.transfer(acc4,9000)  //transfer 9000 from acc3 to acc4
        println("\n\nafter the transactions : \n");printAc(bank)
    }
class Account(id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    
    override def toString ="[  "+nic+"  :   "+acnumber +"  :  "+ balance+"  ]"
    def withdraw(a:Double) =this.balance=this.balance-a
    def deposit(a:Double) =this.balance=this.balance+a
    def transfer(a:Account,b:Double)= {this.withdraw(b); a.deposit(b)}  // transfer function- which transfer the money from this account to a given account.
}
}
