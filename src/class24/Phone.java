package class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlockPhone();
}
class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Iphone has simpler app too display pictures");

    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone has a faceID");
    }
}
class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Samsung has a better picture quality");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung has a fingerprint system");
    }
}
