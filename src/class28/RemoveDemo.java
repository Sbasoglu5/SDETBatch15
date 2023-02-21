package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");

        var name="gfhdsjfdfgfgj";
        var c='s';
        var f=12.5;

        //works from java 6 to 19
       /* Iterator<String> iterator=words.iterator();

        while (iterator.hasNext()){
            String s=iterator.next();
            if (s.endsWith("a")){
                iterator.remove();
            }
        }
*/
        //won't work in java 7 or lower
        words.removeIf(s -> s.endsWith("a"));



        System.out.println(words);



    }
}
