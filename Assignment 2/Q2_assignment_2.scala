object Q2_assignment_2 {
  def main(args: Array[String]): Unit = {


    print("final earning (ticket price=10) = "+final_earning(10)+"\n")
    print("final earning (ticket price=15) = "+final_earning(15)+"\n")
    print("final earning (ticket price=20) = "+final_earning(20)+"\n")
    print("final earning (ticket price=25) = "+final_earning(25)+"\n")
    print("final earning (ticket price=30) = "+final_earning(30)+"\n")
    print("final earning (ticket price=35) = "+final_earning(35)+"\n")
    print("final earning (ticket price=40) = "+final_earning(40)+"\n")


  }

  //question 2
  def no_people(p:Int)=120+(15-p)/5*20
  def xincome(p:Int)=no_people(p)*p
  def cost(P:Int)=500+3*no_people(P)
  def final_earning(p:Int)=xincome(p)-cost(p)
}
