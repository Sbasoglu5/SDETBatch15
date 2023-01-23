package class9Homework;

public class Task6 {
    public static void main(String[] args) {

        int sum=0;
        String [][] countries={{"USA","Canada","Mexico"},{"Guatemala","Argentina","Brazil","Uruguay"},
                {"Switzerland","France","Italy","Greece"},{"Japan","Korea","China","Vietnam"}};
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
