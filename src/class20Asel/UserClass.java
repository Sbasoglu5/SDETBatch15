package class20Asel;

public class UserClass {/*userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.*/

    String name;
    long number;

    UserClass(String name, long number){
        this.name=name;
        this.number=number;
    }
}

class UserInfo extends UserClass {
    String address;

    UserInfo(String name, long number, String address){
        super(name,number);
        this.address=address;

    }

    public void userDetails(){
        System.out.println("NAME : "+name);
        System.out.println("PHONE NUMBER : "+number);
        System.out.println("ADDRESS : "+address);
    }
}
