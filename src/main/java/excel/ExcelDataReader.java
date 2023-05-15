package excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataReader {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "\"D:\\excel";

        FileInputStream inputstream = new FileInputStream(new File(excelFilePath));
        XSSFWorkbook wb = new XSSFWorkbook(inputstream);
        XSSFSheet sheet = wb.getSheet("LoginDetails");
        XSSFRow row = sheet.getRow(2);
        XSSFCell cell = row.getCell(0); // Get 1st username
        String username = cell.getStringCellValue();
        System.out.println("User Name is : " + username);
        cell = row.getCell(1);
        String password = cell.getStringCellValue();
}}
