fun main(args: Array<String>) {

   try {
      val v:String = "PT Wabi Teknologi Indonesia";
      v.toInt();
   } catch(e:Exception) {
      e.printStackTrace();
   } finally {
      println("An exception happened");
   }

}
