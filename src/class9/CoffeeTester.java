package class9;

public class CoffeeTester {
    public static void main(String[] args) {
        Coffee coffee1=new Coffee();
        coffee1.name="Lavazza";
        coffee1.origin="Italy";
        coffee1.strength="Medium";
        coffee1.yearOfProduction=2022;

        coffee1.hotRecipe();
        coffee1.coldRecipe();

        Coffee coffee2=new Coffee();
        coffee2.name="Sturbucks House Blend";
        coffee2.origin="USA";
        coffee2.strength="Strong";
        coffee2.yearOfProduction=2023;

        coffee2.hotRecipe();
        coffee2.coldRecipe();


    }
}
