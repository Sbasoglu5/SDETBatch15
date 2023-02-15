package Replit;

public class Replit140 {
    private String maxLength(String [] longest){
      int max=0;
      String longestString=null;
       for (String s:longest){
           if (s.length()>max){
               max=s.length();
               longestString=s;


            }
       }
       return longestString;
   }

    public static void main(String[] args) {
        Replit140 obj=new Replit140();
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(obj.maxLength(arr));
    }
}
