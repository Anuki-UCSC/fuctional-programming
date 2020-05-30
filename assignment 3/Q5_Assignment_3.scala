object Q5_Assignment_3 {
  def main(args: Array[String]): Unit = {
    println("Addition of even numbers (12) :"+AddEven(12))
    print("Addition of even numbers (7) :"+AddEven(7))
  }

  def AddEven(a:Int):Int= a match{
    case x if(x==2) =>2
    case x if(x%2==0) =>AddEven(x-2)+x
    case x => AddEven(x-3)+(x-1)
  }
}
