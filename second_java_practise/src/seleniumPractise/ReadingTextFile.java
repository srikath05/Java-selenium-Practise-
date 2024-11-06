package seleniumPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String TxtFile = "C:\\Users\\ganji\\OneDrive\\Desktop\\new interview questions .txt";
		try(Scanner sc = new Scanner(new File(TxtFile))){
		
		while(sc.hasNextLine()) {
			
			System.out.println( sc.nextLine());
	     }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
		
		File f = new File ("C:\\Users\\ganji\\OneDrive\\Desktop\\Interview Question[1].docx");
		FileInputStream file = new FileInputStream(f);
		// Create an XWPFDocument to read the .docx file
		XWPFDocument doc = new XWPFDocument(file);
		
		   // Get the list of paragraphs in the document
        int paragraphCount = doc.getParagraphs().size();

        // Iterate over the paragraphs using a normal for loop
        for (int i = 0; i < paragraphCount; i++) {
            XWPFParagraph paragraph = doc.getParagraphs().get(i);
            System.out.println(paragraph.getText());
        }


//        // Iterate over paragraphs in the document and print the text
//	      for (XWPFParagraph paragraph : doc.getParagraphs()) {
//              System.out.println(paragraph.getText());
	}
	}

