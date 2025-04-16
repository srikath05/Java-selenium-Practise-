package seleniumPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
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
		File file =    new File("C:/Users/ganji/OneDrive/Desktop/2025/Emp Details.xlsx");
		
		XSSFWorkbook wb;
		XSSFSheet sheet;
		 //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xls file
        wb=new XSSFWorkbook(inputStream);

        //creating a Sheet object
        sheet=wb.getSheet(sheetname);
        
        for(int i=0; i<=sheet.getLastRowNum();i++) {
    	 System.out.println("Row" + i + " data : ");
    	 for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
    		 System.out.print(sheet.getRow(i).getCell(j) + "= ");
    	   	 System.out.println();
    	   		 }
    	   	 
     wb.close();
     inputStream.close();
		}
		public class ExcelUtil {
			 
			private static final String TEST_DATA_SHEET_PATH = "C:/Users/ganji/OneDrive/Desktop/2025/Emp Details.xlsx";
			private XSSFWorkbook book;
			private XSSFSheet sheet;
		 
			public Object[][] getTestData(String sheetName) {
				Object data[][] = null;
		 
				try {
					FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
					book = new XSSFWorkbook(ip);
					sheet = book.getSheet(sheetName.trim());
		 
					data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 
					for (int i = 0; i < sheet.getLastRowNum(); i++) {
						for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
							data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
						}
					}
		return data;
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
				return data;}
		}}
/*
 * 
 * @DataProvider(name = "registerData")
    public Object[][] getRegisterData() {
        // Sheet name to fetch data from
        String sheetName = "register";
 
        // Call ExcelUtil to read the data from the Excel file
        return ExcelUtil.getTestData(sheetName);
    }
    //////////////////////////////////////////////////////////////
@DataProvider(name = "EmpTestData")
public Object[][] empTestData() {
	return new Object[][] {
			// EmpID,Name,Skills
			{ 1120312, "Veera", Arrays.asList("Java", "Postman", "TestNG") },
			{ 1120313, "Srikanth", Arrays.asList("Java", "BDD", "TestNG") }

	};
}

@Test(dataProvider = "EmpTestData")
public void empTest(int empID, String empName, List<String> skills) {
	System.out.println("empID.." + empID);
	System.out.println("empName.." + empName);
	System.out.println("skills.." + skills);

	assert !empName.isEmpty() : "Name should not be empty";
	assert !skills.isEmpty() : "Skills should not be empty";

}*/

