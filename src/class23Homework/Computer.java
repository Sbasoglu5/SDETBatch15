package class23Homework;

public class Computer {
    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Create objects of child classes and store them into array. Loop through each object and execute available methods.*/

    int RAM;
    int year;
    String operating;
    double price;

    Computer(int RAM, int year){
        this.RAM=RAM;
        this.year=year;

    }

    public void price(){
        System.out.println("Each computer has different price range");
    }
    public void feature(){
        System.out.println("Each computer has different features");
    }
    public void opt(){

    }

}
class Apple extends Computer{

    Apple(int RAM, int year,String operating,double price) {
        super(RAM, year);
        this.operating=operating;
        this.price=price;
    }
    public void price(){
        System.out.println("Apple laptops starting at "+price+"$");

    }
    public void feature(){
        System.out.println("Apple has fastest processor");
    }
    public void opt(){
        System.out.println("Apple uses "+operating);
    }
    public void sss(){
        System.out.println("-----------------------");
    }
    public void aaa(){
        System.out.println("*****************");
    }
}

class Lenovo extends Computer{
    Lenovo(int RAM, int year,String operating,double price) {
        super(RAM, year);
        this.operating=operating;
        this.price=price;
    }
    public void price(){
        System.out.println("Lenovo laptops starting at "+price+"$");

    }
    public void feature(){
        System.out.println("Lenovo has the best screen quality");
    }
    public void opt(){
        System.out.println("Lenovo uses "+operating);
    }
}
class HP extends Computer{
    HP(int RAM, int year,String operating,double price) {
        super(RAM, year);
       this.operating=operating;
       this.price=price;

    }
    public void price(){
        System.out.println("HP laptops starting at "+price+"$");

    }
    public void feature(){
        System.out.println("HP has the best ergonomic design");
    }
    public void opt(){
        System.out.println("HP uses "+operating);
    }
}
class Dell extends Computer{
    Dell(int RAM, int year,String operating,double price) {
        super(RAM, year);
      this.operating=operating;
      this.price=price;
    } public void feature(){
        System.out.println("Dell has the best fan");
    }
    public void price(){
        System.out.println("Dell laptops starting at "+price+"$");

    }
    public void opt(){
        System.out.println("Dell uses "+operating);
    }
}
