package seleniumPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Create an object of File class to open xlsx file
		
		File file =    new File("C:\\Users\\ganji\\OneDrive\\Desktop\\House Warming.xlsx");
        
		 //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);

        //creating a Sheet object
        XSSFSheet sheet=wb.getSheet("Sheet1");
        
     for(int i=0; i<=sheet.getLastRowNum();i++) {
    	 System.out.println("Row" + i + " data : ");
    	 for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
    		 System.out.print(sheet.getRow(i).getCell(j) + "= ");
    	   	 System.out.println();
    }
     wb.close();
     inputStream.close();
}
}



