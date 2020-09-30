package Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelreadReview {

	public static void main(String[] args) throws IOException {
		
		String xlPath=System.getProperty("user.dir")+"/test data/sample.xlsx";
		
		FileInputStream fis=new FileInputStream(xlPath);
		
		Workbook workbook=new XSSFWorkbook(fis);
		
		Sheet sheet=workbook.getSheet("Sheet1");
		
		Row row1=sheet.getRow(0);
		
		Cell row1Cell3=row1.getCell(1);
		
		String value=row1Cell3.toString();
		
		System.out.println(value);//LastName
		
		Row row2=sheet.getRow(1);
		
		String valueOfAnotherCell=row2.getCell(0).toString();
		System.out.println(valueOfAnotherCell);
		
		//List of Maps
	}
}