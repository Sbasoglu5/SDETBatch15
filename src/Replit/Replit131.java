package Replit;

public class Replit131 {
    static String thirdLetter(String s){
        String newStr="";
        for (int i = 0; i < s.length(); i++) {
            if (i==0||i%3==0){
                newStr+=(s.charAt(i));
            }
        }
        return newStr;
    }
    public static void main(String[] args){
        Replit131 third= new Replit131();
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
