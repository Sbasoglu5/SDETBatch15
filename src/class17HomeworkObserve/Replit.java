package class17HomeworkObserve;


public class Replit {
   String censorLetter(String a,char c){
     return a.replace(c,'*');
   }

   public static void main(String[] args) {

      Replit rep = new Replit();
      System.out.println(rep.censorLetter("computer science",'e'));
       System.out.println(rep.censorLetter("trick or treat",'t'));
   }

    /*static void addArray(int [] array){//machine
        int sum =0;
        for (int number:array){
            sum+=number;

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40};
        addArray(arr);
    }*/
}