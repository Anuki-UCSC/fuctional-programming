object MyClass {

    def main(args: Array[String]) {
      val s1=point(4,5) 
      val s2=point(1,1) 
      val s3=s1.move(2,3) // move function testing
      println(s1)
      println(s3)
      println(s1==s2)
      val v4=s1+s2       // + function testing
      println(v4)
     println(s2.distance(s1)) // distance function testing
     println(s1.invert())   //invert function testing
      
    }
    
    case class point(a:Int,b:Int){
        def x:Int=a
        def y:Int=b
        
        def +(that:point)=point(this.x+that.x,this.y+that.y)// Q1- +function
        def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy)  // Q2- move function
        def distance(that:point)=scala.math.sqrt(scala.math.pow(this.x-that.x,2) +scala.math.pow(this.y-that.y,2)) //Q3 - distance function
        def invert()= point(this.y,this.x)// Q4- invert function
        
        
    }
}
