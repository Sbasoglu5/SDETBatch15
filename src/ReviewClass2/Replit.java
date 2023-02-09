package ReviewClass2;

public class Replit {
   static String alphebetical(String str){
      String a="abcdefghijklmnopqrstuvwxyz";
      String newStr="";
      for (int i = 0; i < str.length(); i++) {
         for (int j = 0; j<a.length() ; j++) {
            if (str.charAt(i)<a.charAt(j)){
               newStr+=str.charAt(i);
            }
         }

      }
      return newStr;
   }

   public static void main(String[] args) {
      System.out.println(alphebetical("hello"));
   }
}




