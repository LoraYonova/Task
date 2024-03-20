import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;


public class ReadExel {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Desktop\\test.xlsx";

        try (FileInputStream file = new FileInputStream(new File(filePath));
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {

            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    switch (cell.getCellTypeEnum()) {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }

                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
