package class19Asel;

public class ConstructorChain {
    ConstructorChain(){
        System.out.println("I am a non-argument constructor");
    }

    ConstructorChain(String str){
        this(); //making a call to non argument constructor
                //this()  ALWAYS must be on the first line
        System.out.println(str);
    }

    ConstructorChain(String str,int number){
        this(str);
        System.out.println("This is a constructor with int parameter "+number);
    }

    public static void main(String[] args) {

        ConstructorChain obj=new ConstructorChain("hello",10);

        System.out.println("-------- end ----------");
    }
}
