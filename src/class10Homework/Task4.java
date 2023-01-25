package class10Homework;

public class Task4 {
    public static void main(String[] args) {
        // How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
        String str = "This is the sentence i want to reverse";
        String []words=str.split(" ");
        String reverseSentence = "";



        for (int i =0; i< words.length; i++) {
            String word=words[i];
            String reverseWord=" ";
            for (int j =word.length()-1; j >=0 ; j--) {
                reverseWord=reverseWord+word.charAt(j);
            }

            reverseSentence=reverseSentence+reverseWord+" ";

        }
        System.out.println(reverseSentence);
    }
}
