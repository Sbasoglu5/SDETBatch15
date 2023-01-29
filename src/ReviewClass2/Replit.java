package ReviewClass2;

public class Replit {
    public static void main(String[] args) {

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };


        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                int[]rowSum=new int[i];
                sum=sum+a[i][j];
            }
            System.out.println(sum);

        }



    }
}
