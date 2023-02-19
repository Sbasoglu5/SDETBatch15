package class27;

public class Demo2 {

    public static void main(String[] args) {
        String name="Savo";
        String [] names={"Hiral","Nima","Laura","Nat"};
        System.out.println(display(name,names));

    }
    public static Boolean display(String nameToSearch,String [] names) {
        for (String name : names) {
            if (nameToSearch.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
