package class25;

public class WashableTester {
    public static void main(String[] args) {


        WashAble[] washAbles = {new SmartWatch(), new Phone(), new Inverter()};
        for (WashAble w:washAbles){
            w.wash();
        }
    }
}
