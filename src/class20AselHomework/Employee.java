package class20AselHomework;

public class Employee {
    /*Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.*/
    String companyName;
    String companyLocation;
    int fullTimeHours;
    int partTimeHours;

    Employee (String companyName,String companyLocation, int fullTimeHours, int partTimeHours){
        this.companyName=companyName;
        this.companyLocation=companyLocation;
        this.fullTimeHours=fullTimeHours;
        this.partTimeHours=partTimeHours;
    }
    void ePrint(){
        System.out.println(companyName+", located in "+companyLocation+" with "+fullTimeHours+" for full or "+partTimeHours+" for part time working hours");
    }
}
class FullTime extends Employee{
    String name;
    String id;
    String workType;

    FullTime(String companyName, String companyLocation, int fullTime,int partTime,String name,String id,String workType){
        super(companyName,companyLocation,fullTime,partTime);
        this.name=name;
        this.id=id;
        this.workType=workType;
    }
    void fPrint(){
        System.out.println(name+" with employee number of "+id+" currently working as "+workType);
    }
}
class PartTime extends Employee{
    String name;
    String id;
    String workType;

    PartTime(String companyName, String companyLocation, int fullTime,int partTime,String name,String id,String workType){
        super(companyName,companyLocation,fullTime,partTime);
        this.name=name;
        this.id=id;
        this.workType=workType;
    }
    void pPrint(){
        System.out.println(name+" with employee number of "+id+" currently working as "+workType);
    }

}

