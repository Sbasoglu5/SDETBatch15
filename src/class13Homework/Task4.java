package class13Homework;

public class Task4 {
    public static void main(String[] args) {
       // How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever


        String str="This is sentence I want to reverse";
        String [] arr=str.split(" ");
        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }
        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }


    }
}
