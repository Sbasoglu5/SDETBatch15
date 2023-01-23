package class9Homework;

public class phoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="iphone";
        iphone.model="13 Pro Max";
        iphone.storage=256;
        iphone.screenSize=6.7;
        iphone.price="1199$+tax";

        iphone.camera();
        iphone.feature();

        Phone samsung=new Phone();
        samsung.brand="Samsung";
        samsung.model="Galaxy Z Fold";
        samsung.storage=512;
        samsung.screenSize=7.6;
        samsung.price="1599$+tax";

        samsung.reliable();
        samsung.speed();

        Phone sony=new Phone();
        sony.brand="Sony";
        sony.model="Xperia PRO";
        sony.storage=512;
        sony.screenSize=7.0;
        sony.price="1299$+tax";

        sony.cheap();
        sony.looks();
    }
}
