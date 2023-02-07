package class20;

public class SportTester {
    public static void main(String[] args) {
        Cricket cricket=new Cricket("Cricket","Australia","Green Helmet");
        cricket.display();
        cricket.displayCricket();
        Soccer soccer=new Soccer("Soccer","Argentina","team",11);
        soccer.display();
        soccer.displayTeam();

    }
}
