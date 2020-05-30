object Q3_assignment_3 {
def main(args :Array[String])={

  print(addnum(5))

}

  def addnum(a:Int):Int= a match{
    case x if(x==1)=>1
    case x => addnum(x-1)+x
  }
}
