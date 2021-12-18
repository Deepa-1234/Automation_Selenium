package qsp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.demo.actiTIME.FileLib;

public class DemoUsingGenericMehtods {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib obj=new FileLib();
		String data=obj.getExcelData("CreateCustomer", 1, 4);
		System.out.println(data);
		String url = obj.getPropertyData("url");
		System.out.println(url);
	}

}
