package class2;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte)number;
        System.out.println(shorterNumber);
        float f=10.5f;
        int num=(int)f;
        System.out.println(num);

        byte b=10;
        int number2=b;
        short c=(short) number2;
        System.out.println(b);
        //when 2 devs write cods they might use only long and the other int
        //with these codes will match once gathered.

        float eggs=12.5f;
        int wholePart=(int)eggs;
        System.out.println(wholePart);


    }
}
