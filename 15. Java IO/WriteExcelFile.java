import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class WriteExcelFile {
    public static void main(String[] args) throws IOException {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Sheet1");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Hello Excel");

        FileOutputStream fos = new FileOutputStream("data.xlsx");
        wb.write(fos);
        wb.close();
        fos.close();
    }
}
