package Replit;

public class Replit139 {
   public String alphabetical(String str){
      String letter=str.charAt(0)+"";
      for(int i=1;i<str.length();i++){
         if(str.charAt(i)>str.charAt(i-1)){
            letter+=str.charAt(i);
         }

      }
      return letter;
   }

   public static void main(String[]args){
      Replit139 ma=new Replit139();

      System.out.println(ma.alphabetical("hello"));
      System.out.println(ma.alphabetical("software"));
      System.out.println(ma.alphabetical("language"));
   }
}






