package class6;

public class ArraysDemo4 {
    public static void main(String[] args) {
        char [] letters={'A','B','c','d','e','F'};
        letters[0]='Z';
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
