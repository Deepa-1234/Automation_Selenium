package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFrmPropertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String un=p.getProperty("username");
		String pwd=p.getProperty("password");
		System.out.println("Username:"+un);
		System.out.println("password:"+pwd);
		
	}

}
