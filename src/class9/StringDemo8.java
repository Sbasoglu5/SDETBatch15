package class9;

public class StringDemo8 {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(4);
        System.out.println(c);

        int count=0;
        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i));
            if (str.charAt(i)=='a') {
                count++;
            }

        }
        System.out.println(count);
    }
}

