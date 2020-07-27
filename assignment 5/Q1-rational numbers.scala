
object Assignment_05_part1 {
    def main(args: Array[String]): Unit = {
    val x=new rational(3,4)    
    val y=new rational(5,8)
    val z=new rational(2,7)
    
    val f=x.neg    // Q1- negation of a rational number
    val e=x-y-z    // Q2- answer of x-y-z
  
    println(f)
    println(e)

  }
}

class rational(n:Int,d:Int){
    require(d>0,"denominator must be greater than zero !")
    def nume=n/isneg(gcd(n,d))
    def deno=d/isneg(gcd(n,d))
    private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
    
    def this(n:Int)=this(n,1)
    override def toString=nume+"/"+deno
    def +(r:rational)=new rational(this.nume*r.deno + this.deno*r.nume, this.deno*r.deno)
    def neg =new rational(-this.nume,this.deno)
    def isneg(x:Int):Int= if(x<0) -x else x
    def -(r:rational)=this+r.neg
}


