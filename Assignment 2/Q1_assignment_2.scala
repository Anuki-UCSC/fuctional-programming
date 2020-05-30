import scala.collection.mutable.ArrayBuffer

object Q1_assignment_2 {
  def main(args: Array[String]): Unit = {
    print("Question 1 :takehome salary = "+takehome_salary(40,20))

  }
// question 1
  def norm(h:Int)=150*h
  def OT(h:Int)=75*h
  def income(h1:Int,h2:Int)=norm(h1)+OT(h2)
  def tax(in:Int)=in*.1
  def takehome_salary(h1:Int,h2:Int)=income(h1,h2)-tax(income(h1,h2))

}
