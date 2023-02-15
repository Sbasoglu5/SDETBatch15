package Replit;

public class Replit148 {
    String item;
    double price;
    int quantity;

    Replit148(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;

    }
    public String itemTotalPrice(){
       double totalPrice=quantity*price;
       return item+" Total Value "+totalPrice;
    }

    public static void main(String[] args) {
        Replit148 s1 = new Replit148("Blanket", 49.99, 2);
        Replit148 s2 = new Replit148("Mattress", 439.18, 1);
        System.out.println(s1.itemTotalPrice());
        System.out.println(s2.itemTotalPrice());
        System.out.println("You purchased "+((s1.price*s1.quantity)+s2.price)+" Today");
    }
}
