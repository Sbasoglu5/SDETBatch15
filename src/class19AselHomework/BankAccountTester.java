package class19AselHomework;



public class BankAccountTester {
    public static void main(String[] args) {

        InheritanceBankAccount ba = new InheritanceBankAccount();
        ba.accountNumber = 764574584584l;
        ba.money=1000;
        ba.deposit();


        //ba.transfers defined in child class cannot be reached from a parent class

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("--Creating an object of the checking account--");

        Checking check=new Checking();
        check.accountNumber=5765;
        check.money=780;
        check.interest=0;

        check.deposit();//from parent
        check.transfers();//from child

        System.out.println("--Creating an object of the savings account--");
        Savings save=new Savings();
        save.accountNumber=9998798454l;
        save.money=45000;
        save.profit=100;
        //save.interest=0; only can be inherited from parent not from siblings

        save.deposit();//parent
        save.takeProfit();//savings itself

        System.out.println("--Creating an object of the super saving account--");
        SuperSavings sub=new SuperSavings();
        sub.accountNumber=7896541;
        sub.money=500;
        sub.superSave="money saved";

        sub.deposit();//grand parent
        sub.takeProfit();//parent
        sub.SuperSaving();// grandchild

    }

}
