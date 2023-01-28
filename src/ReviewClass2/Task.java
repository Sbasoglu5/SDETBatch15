package ReviewClass2;

public class Task {
    public static void main(String[] args) {
        int [][] array={{1,2,3},
                {11,12,13},
                {20,21,22},
                {100,101}};
        int sum=0;
        for (int [] num:array){
            for (int a:num){
             sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}
