package ReviewClass7;

public class Reverse {
    String reverse(String remember){
        StringBuilder sb=new StringBuilder(remember);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Reverse reverse=new Reverse();
        System.out.println(reverse.reverse("Don't forget the parenthesis"));
    }
}
