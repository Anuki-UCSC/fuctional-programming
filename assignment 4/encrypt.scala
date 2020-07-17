object HelloWorld {
   def main(args: Array[String]) {
      println(simple(110,0));
      println(capital(65,0));
      println(isSimple('a'));
      println(isSimple('?'));
      println(isSimple('Z'));
      println(iscapital('a'));
      println(iscapital('?'));
      println(iscapital('Z'));
      encrypt("Anuki Gayara");

   }
   
   def simple(i:Int,shift:Int):Char={
          if((i+shift)>=123) (((i+shift)%122)+96).toChar else (i+shift).toChar
      }
   def capital(i:Int,shift:Int):Char={
          if((i+shift)>=91) (((i+shift)%90)+64).toChar else (i+shift).toChar
      }
      
   def isSimple(i:Char):Boolean={if(96<i.toInt && i.toInt<123) true else false}
   
   def iscapital(i:Char):Boolean={if(64<i.toInt && i.toInt<91) true else false}
   
    def encrypt(s:String):Any= {s.foreach(i =>print(if(iscapital(i)) capital(i.toInt,2) else {if(isSimple(i)) simple(i.toInt,2) else i}))}

}
