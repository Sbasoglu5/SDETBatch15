package class28Homework;

import java.util.LinkedList;

public class Card {
    double interestRate;
    String cardType;
    Card(double interestRate,String cardType){
        this.interestRate=interestRate;
        this.cardType=cardType;

    }
    public void interest(){
        System.out.println(cardType+" has "+interestRate+"% for 10000$");
    }
}
class CardTester{
    public static void main(String[] args) {
        Card amex=new Card(4.3,"Amex");
        Card chase=new Card(3.9,"Chase");
        Card citi=new Card(3.7,"Citi");

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(amex);
        cards.add(chase);
        cards.add(citi);

        for (Card c:cards){
            c.interest();
        }
        System.out.println("__________________________");

        cards.forEach(i->i.interest());
        System.out.println("___________________________");

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).interest();

        }

    }
}
