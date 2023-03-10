package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileDemo6 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Book2.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet2 = xssfWorkbook.getSheet("Sheet2");

        for (int i = 0; i < sheet2.getPhysicalNumberOfRows(); i++) {
            Row row = sheet2.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }

}
