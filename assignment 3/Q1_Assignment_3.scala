object Q1_Assignment_3 {
  def main(args: Array[String]): Unit = {
    print("Enter a number : ") 
    var n =scala.io.StdIn.readInt()
    println("7 is a prime number : "+ isPrime(n))
  }

  def isPrime(a:Int,i:Int=2):Boolean= i match{
    case x if(a==x) => true
    case x if(a%x <1) => false
    case x => isPrime(a, x+1)
  }
}
