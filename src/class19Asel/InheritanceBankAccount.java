package class19Asel;

public class InheritanceBankAccount { //parent or super or base class

    long accountNumber;
    double money;


    void deposit() {
        System.out.println("Deposit from a bank account class");
    }
}

class Checking extends InheritanceBankAccount{ // child or subclass or derived class

    double interest;
    void transfers(){
        System.out.println("Transfer methods from checking account ");
    }
}

class Savings extends InheritanceBankAccount{

    double profit;

    void takeProfit(){
        System.out.println("Profit methods form savings class");
    }
}

class SuperSavings extends Savings{

    String superSave;
    void SuperSaving(){
        System.out.println("Super saving methods from SuperSaving class");
    }
}

