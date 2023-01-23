package class9Homework;

public class Task3 {
    public static void main(String[] args) {
        String [][] groceries={{"avocado","zucchini","lettuce","carrots"},{"grapes","apples","peach","pear"},
                {"milk","cheese","yogurt","sour cream"},{"cookies","ice cream","carrot cake","candies"}};
        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("______________________");

        for (String[] shopping : groceries){
            for (String s : shopping){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
