object Assignment4{
  def main(args:Array[String]) {

    Encrypt_Decrypt()
  }
  def Encrypt_Decrypt(): Unit ={
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var s:String = "ANUKI GAYARA"
    val E=(c:Char,key:Int,a:String)=> if(c!=' ') a((a.indexOf(c.toUpper)+key)%a.size) else ' '
    val D=(c:Char,key:Int,a:String)=> if(c!=' ') a((a.indexOf(c.toUpper)-key+a.size)%a.size) else ' '

    val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))
    val ct=cipher(E,s,1,alphabet)
    val pt=cipher(D,ct,1,alphabet)

    println(s)
    println(ct)
    println(pt)
    
  }
}


// *********** OUTPUT FOR THE ABOVE CODE****************
/*

ANUKI GAYARA
BOVLJ HBZBSB
ANUKI GAYARA

*/
//*******************************************************
