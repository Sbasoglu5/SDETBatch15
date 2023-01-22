package class7;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        // a 2D array which can hold 3 one D arrays
        // each of  size 3
        String[][] thomsonTrain=new String [3][3];
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;


//  or instead of above this is the short way aka matrix;
//  String [][] thomsonTRain={{"A","B","C"},{"D","E","F"},{"G","H","J"}};


        System.out.println(thomsonTrain[2][1]);
        //System.out.println(thomsonTrain[0]); won't show anything instead write below
        System.out.println(Arrays.toString(thomsonTrain[0]));
    }
}
