package class20Homework;

public class EmployeeTest {
    public static void main(String[] args) {
        FullTime full=new FullTime("Syntax","Atlanta",40,25,"Tom Jackson","st456","Full time");
        full.ePrint();
        full.fPrint();
        PartTime part=new PartTime("Syntax Technologies","Atlanta,US",38,22,"Kathy Pierce","st789","Part time");
        part.ePrint();
        part.pPrint();
    }
}
