object Q2_Assignment_3 {
  def main(args: Array[String]): Unit = {

    println("\n list of prime numbers : ")
    seq_prime(20) // prime numbers below 20
    }

    def isPrime(a:Int,i:Int=2):Boolean= i match{
      case x if(a==x) => true
      case x if(a%x <1) => false
      case x => isPrime(a, x+1)
    }


  def seq_prime(n:Int):Any={
    if(n==1) println("1")
    else if(isPrime(n)==true) {println(n) ; seq_prime(n-1)}
    else seq_prime(n-1)
  }


}
