package ReviewClass10Asghar;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.io.FileInputStream;
import java.util.Map;

public class ExcelDemo1 {
    public static void main(String[] args) {
        String path="Files/Book1Review.xlsx";

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet1=xssfWorkbook.getSheet("Sheet1");

            int noOfRows=sheet1.getPhysicalNumberOfRows();
            List<Map<String,String>> excelData=new ArrayList<>();
            Row row0=sheet1.getRow(0);
            for (int i = 1; i < noOfRows; i++) {
                LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
                Row row=sheet1.getRow(i);

                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                    rowMap.put(row0.getCell(j).toString(),row.getCell(j).toString());
                }
            excelData.add(rowMap);
            }
            System.out.println(excelData);
        } catch (Exception e) {
            System.out.println("Please check the path of the file");
        }
    }
}
