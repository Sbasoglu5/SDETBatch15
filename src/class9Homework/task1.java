package class9Homework;

public class task1 {
    public static void main(String[] args) {


        String[][] names = {{"Sezar", "Mike", "Sam", "Judy"},
                {"A", "C", "B", "A"}};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                if (names[i][j].equals("A")||names[i][j].equals("B"))

                System.out.print(names[0][j]+" ");
            }

        }

    }
}
