package ReviewClass8;

public class ForLoops {
    public static void main(String[] args) {
        // used when we know how many times we'll repeat the block of code
        for (int i = 1; i <=10 ; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue;

            }
            System.out.println("hello");
            System.out.println("hi");
        }

    }
}
