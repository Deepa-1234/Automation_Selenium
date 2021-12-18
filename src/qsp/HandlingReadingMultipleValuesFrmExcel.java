package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingReadingMultipleValuesFrmExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
Workbook wb=WorkbookFactory.create(fis);
int count=wb.getSheet("Invalidlogin").getLastRowNum();
for(int i=0;i<=count;i++) {
	String uname=wb.getSheet("Invalidlogin").getRow(i).getCell(0).getStringCellValue();
	String pwd=wb.getSheet("Invalidlogin").getRow(i).getCell(1).getStringCellValue();
	System.out.print(uname+" ");
	System.out.println(pwd);
}
	}

}
