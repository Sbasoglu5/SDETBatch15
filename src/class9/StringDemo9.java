package class9;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="jdnfks 3495gfhfd4545 &^$#%hfhfh$";
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                count++;
            }

        }
        System.out.println(count);

    }
}
