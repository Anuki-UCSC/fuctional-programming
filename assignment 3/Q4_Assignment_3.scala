object Q4_Assignment_3 {
def main(args: Array[String]): Unit={
print("\nnumber 6 is : "+oddeven(6))
  print("\nnumber 10001 is : "+oddeven(10001))

}

  def oddeven(n:Int):String= n match{
    case x if(x==0) => "EVEN"
    case x if(x==1) => "ODD"
    case x => oddeven(n-2)
  }
}
