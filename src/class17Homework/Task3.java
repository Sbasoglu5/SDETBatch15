package class17Homework;

public class Task3 {
    /*Write a java class that have 4 constructors with 4 different access levels of constructors (private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
     and observe result.*/

    String name;
    int ssn;
    String state;
    String phoneNumber;

    private Task3(String name2,int ssn2,String state2,String number){
        name=name2; //Tom
        ssn=ssn2;
        state=state2;
        phoneNumber=number;

    }
    Task3(String name2,String number,String state2) {
        name = name2; //Thomas
        state = state2;
        phoneNumber = number;
    }
    protected Task3(String name2,int ssn2,String number) {
        name = name2;
        ssn = ssn2;
        phoneNumber = number;
    }
    public Task3(int ssn2,String state2,String number,String name2) {
        ssn = ssn2;
        state = state2;
        phoneNumber = number;
        name=name2; //Katy
    }

    public void print(){
        System.out.println(name+ssn+state+phoneNumber);
    }

    public static void main(String[] args) {
        Task3 pri=new Task3("Tom ",1234567," WI "," (789)456-3278");
        pri.print();
    }
}
