package collections;
import java.util.*;
import java.io.*;
public class PropertiesDemo {

	public static void main(String[] args)throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		p.load(fis);
		System.out.println("JDBC parameters");
		System.out.println("-----------------");
		System.out.println("Driver_Class      :"+p.getProperty("driver_Class"));
		System.out.println("Driver_URL--------:"+p.getProperty("driver_URL"));
		System.out.println("DB_User-----------:"+p.getProperty("db_User"));
		System.out.println("DB_Password-------:"+p.getProperty("db_Password"));
	}

}
