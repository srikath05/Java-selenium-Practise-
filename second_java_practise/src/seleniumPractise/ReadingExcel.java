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

		String filepath = "path";
		String sheetname = "sheet1";
		readingex(filepath, sheetname);
		
	}
		//Create an object of File class to open xlsx file
		public static void readingex(String filepath , String sheetname) throws IOException {
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
//     
//     String excelFilePath = "path_to_your_excel_file.xlsx"; // Replace with your file path
//     String roleToSearch = "tl"; // Replace with the role you want to search
//
//     try (FileInputStream file = new FileInputStream(new File(excelFilePath));
//          Workbook workbook = new XSSFWorkbook(file)) {
//
//         // Get the first sheet
//         Sheet sheet = workbook.getSheetAt(0);
//
//         // Iterate through rows
//         for (Row row : sheet) {
//             Cell roleCell = row.getCell(0); // Role column
//             if (roleCell != null && roleCell.getStringCellValue().equalsIgnoreCase(roleToSearch)) {
//                 // Fetch User ID and Password
//                 String userId = row.getCell(1).getStringCellValue(); // User ID column
//                 String password = row.getCell(2).getStringCellValue(); // Password column
//
//                 // Print the result
//                 System.out.println("Role: " + roleToSearch);
//                 System.out.println("User ID: " + userId);
//                 System.out.println("Password: " + password);
//                 return;
//             }
//         }
//
//         System.out.println("Role not found: " + roleToSearch);
//     } catch (IOException e) {
//         e.printStackTrace();
//     }
     

}}



