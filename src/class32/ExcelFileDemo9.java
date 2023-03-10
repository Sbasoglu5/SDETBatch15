package class32;

import utilsIMPORTANT.ExcelReader;

import java.io.IOException;
import java.util.Map;
import java.util.List;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> excelData= ExcelReader.read();
        //var excelData= ExcelReader.read();
       /* Map<String,String> firstRow=excelData.get(1);
        System.out.println(firstRow.get("salary"));*/
        //System.out.println(firstRow);

        for (Map<String, String> row : excelData) {
            for (var entry : row.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println("=================");
        }

    }
}
