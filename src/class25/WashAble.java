package class25;


public interface  WashAble{

    void wash();
}

class SmartWatch implements WashAble {

    @Override
    public void wash() {
        System.out.println("You can wash me");

    }
}
class Phone implements WashAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
class Inverter implements WashAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
