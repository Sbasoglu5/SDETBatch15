package class20Asel;

public class Child1 extends Parent {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        c1.bye();//works to but not the right way to go with static
        Parent.bye();//bc it's static
        Child1.bye();//bc it's static
        bye();//bc it's static
        //c1.money(); private

        c1.name="Sezar";
        c1.lastName="Basoglu";//works to but not the right way to go with static
        Child1.lastName="Basoglu";//bc it's static
        Parent.lastName="Basoglu";//bc it's static
        lastName="Basoglu";//bc it's static
    }
}
