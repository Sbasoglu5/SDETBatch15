package GroupProjectHomework;

public class MarksTester {
    public static void main(String[] args) {
    Marks [] scores={new StudentA(78,88,69),new StudentB(75,68,77,92)};
    for (Marks score:scores){
        score.getPercentage();
    }
}
}
