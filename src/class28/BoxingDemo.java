package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10);
        int number=integer;// auto unboxing
        int number2=integer.intValue();// this was manual unboxing

        double d=12.3;
        Double wrapperD=new Double(d);// boxing
        Double wrapperP=d;// autoBoxing
        Double wrapperR=12.5; //also autoBoxing

        Float f=12f;
        ArrayList<Float> arrayList=new ArrayList<>();
        arrayList.add(12.0f); //(12)There's no type casting with collection framework
                             // We can only store whatever we point in <> ie. if it's Double we cant store Float value

        double fg=12;

    }
}
