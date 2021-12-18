package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingXmldata {

	public static void main(String[] args)throws IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String value=wb.getSheet("CreateCustomer").getRow(1).getCell(4).getStringCellValue();
		System.out.println(value);
	}

}
