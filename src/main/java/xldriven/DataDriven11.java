package xldriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven11 {
	
	
String excelfilesource = "‪C:\\Users\\kiran\\Desktop\\Slides\\testdata.xlsx";
	
	
	
	
	public String readdata(int row , int clm) throws IOException {
		
		FileInputStream fis = new FileInputStream(excelfilesource);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		return wb.getSheet("Sheet2").getRow(row).getCell(clm).getStringCellValue();
		
		
	}
	
	
	public void writedata(int row , int clm , String val) throws IOException {
		
FileInputStream fis = new FileInputStream(excelfilesource);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet2").getRow(row).createCell(clm).setCellValue(val);		
		
		FileOutputStream fos = new FileOutputStream(excelfilesource);
		wb.write(fos);
		fos.close();
		
	}
	
	

}
