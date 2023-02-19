package GroupProjectHomework;

public class CarTester {
    public static void main(String[] args) {
        Car [] sales={new Sedan(500000,"White",3000),new Truck(600000,"Black",22)};
        for (Car price:sales){
            System.out.println(+price.calculateSalePrice()+"$ for "+price.color+" color included all discounts*");
            System.out.println("Tax will be added at end of the sale** ");


        }
    }
}
