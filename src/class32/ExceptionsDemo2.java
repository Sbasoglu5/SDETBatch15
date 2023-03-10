package class32;

import utilsIMPORTANT.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo2 {
    public static void main(String[] args) throws IOException {


        /*try {
            ExcelReader.read();
        }catch (Exception e){
            System.out.println(e);
        }*/
        test();


    }
    static void test() throws IOException {
        /*try {
            ExcelReader.read();
        }catch (Exception e){
            System.out.println(e);
        }*/
        //ExcelReader.read();
        try {
            ExcelReader.read();
        }catch (Exception e){
            try{
                System.out.println(e);
            }catch (Exception exception){
                System.out.println(exception);
            }
        }
    }
}
