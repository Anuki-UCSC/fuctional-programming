object Q6_Assignment_3 {
  def main(args: Array[String]): Unit ={
    print("\nFibonacci Sequence  : \n")
  fibonacciSeq(15)
  }

def fib(N:Int):Int= N match{
  case 0 => 1
  case 1 => 1
  case x => fib(x-1)+ fib(x-2)
}
  def fibonacciSeq(n:Int){
    if(n>0){
      fibonacciSeq(n-1);
    }
    print(fib(n)+"  ,")
  }
}
