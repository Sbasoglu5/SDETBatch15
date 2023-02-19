package class27;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('S');
        characters.add('E');
        characters.add('Z');
        characters.add('A');
        characters.add('R');
        characters.add('&');
        characters.add('K');
        characters.add('A');
        characters.add('T');
        characters.add('I');
        characters.add('E');

        for (Character c:characters){
            System.out.print(c+" ");
        }
    }
}
