package class9;

public class StringDemo5 {
    public static void main(String[] args) {
        String str="Java";
        String str2="Java";

        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);

        System.out.println("***************");

        String str3="Java";
        String str4="JAVA";

        boolean areEquals2=str3.equalsIgnoreCase(str4);
        System.out.println(areEquals2);
    }
}
