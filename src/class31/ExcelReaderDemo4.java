package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {

        String path = "Files/Book2.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        int numOfRows = sheet1.getPhysicalNumberOfRows();

        var excelData=new ArrayList<>();
        for (int i = 1; i < numOfRows; i++) {
            Row row = sheet1.getRow(i);
            LinkedHashMap rowMap=new LinkedHashMap<>();
            rowMap.put("Name",row.getCell(0));
            rowMap.put("age",row.getCell(1));
            rowMap.put("City",row.getCell(2));
            rowMap.put("salary",row.getCell(3));
            excelData.add(rowMap);
        }
    }
}
