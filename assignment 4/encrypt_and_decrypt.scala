object assignment {
   def main(args: Array[String]) {
     
      println("Encrypption and decription is done by 2 shifts: \n");
      
      // testcase 1
      print("'Anuki Gayara' is encrypted as : "); encrypt("Anuki Gayara");
      print("\ndecrypted text : ");decrypt("Cpwmk Icactc");
      // testcase 2
      print("\n\n'XYZ' is encrypted as : ");encrypt("XYZ");
      print("\ndecrypted text : ");decrypt("ZAB");
   }
   // encrypting the text
   
   def simple(i:Int,shift:Int):Char={
          if((i+shift)>=123) (((i+shift)%122)+96).toChar else (i+shift).toChar}
   def capital(i:Int,shift:Int):Char={
          if((i+shift)>=91) (((i+shift)%90)+64).toChar else (i+shift).toChar}   
   def isSimple(i:Char):Boolean={if(96<i.toInt && i.toInt<123) true else false}
   def iscapital(i:Char):Boolean={if(64<i.toInt && i.toInt<91) true else false}
   def encrypt(s:String):Any= {s.foreach(i =>print(if(iscapital(i)) capital(i.toInt,2) else {if(isSimple(i)) simple(i.toInt,2) else i}))}
    
    
    
    // decrypting the text
    
     def decry_simple(i:Int,shift:Int):Char={
          if(i>96+shift) (i-shift).toChar else (i+(26-shift)).toChar}
     def decry_capital(i:Int,shift:Int):Char={
          if(i>64+shift) (i-shift).toChar else (i+(26-shift)).toChar}
   def decrypt(s:String):Any= {s.foreach(i =>print(if(iscapital(i)) decry_capital(i.toInt,2) else {if(isSimple(i)) decry_simple(i.toInt,2) else i}))}

}
