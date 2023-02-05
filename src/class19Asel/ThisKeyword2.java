package class19Asel;

public class ThisKeyword2 {
    void hello(){
        System.out.println("hello");
    }
    void howAreYou(){
        System.out.println("how are you");
    }

    void greeting(){
        hello(); //this keyword refers to the current instance method
        this.howAreYou(); //this. is already used initially we don't have to put it here
    }

    public static void main(String[] args) {
        ThisKeyword2 greet=new ThisKeyword2();
        greet.howAreYou();
        greet.greeting();
        greet.hello();
    }
}
