package class19AselHomework;

public class ClassA {
   String schoolName;
   int grade;
   char buildingNo;

  static void printF(){
     System.out.println("General info for all students from ClassA");
  }
}
class ClassB extends ClassA{

   String name;
   String idNum;

   static void subInfo(){
      System.out.println("Semi personal info from ClassB");
   }
}
class ClassC extends ClassB{
   String userName;
   String password;

   static void subInfo2(){
      System.out.println("Personal info from ClassC");
   }
}
