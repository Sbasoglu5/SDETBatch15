package class17;

public class Dog {
    String breed;
    String name;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }


    void printInfo(){
        System.out.println("Name : "+name+" Breed : "+breed+" Age :  "+age+" Weight : "+weight);
    }




}
