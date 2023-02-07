package class20Asel;

public class Sport {
    String name;
    String country;

    Sport (String name,String country){
        this.name=name;
        this.country=country;
    }

    public void display(){
        System.out.println(name+" is played in "+country+" SPORT CLASS");
    }
}

class Cricket extends Sport{
    String helmet;

    Cricket(String name,String country, String helmet){
        super(name,country);
        this.helmet=helmet;
    }
    public void displayCricket(){
        System.out.println(name+" is played in "+country+" by wearing "+helmet+" CRICKET CLASS");
    }

}

class Soccer extends Sport{

    String team;
    int numberOfPlayers;
    Soccer(String name,String country,String team,int numberOfPlayers){
        super(name,country);
        this.team=team;
        this.numberOfPlayers=numberOfPlayers;

    }

    public void displayTeam(){
        System.out.println(country+" has the best "+name+" "+team+" in the world. "+name+" is played with "+numberOfPlayers+" players SOCCER CLASS");
    }
}
