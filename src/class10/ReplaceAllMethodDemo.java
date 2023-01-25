package class10;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="kJDKLSJDHZJDSJ452hfsaljfkah$#%^#@%#@()*";
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));

        System.out.println(str.replaceAll("[A-Z]",""));

    }
}
