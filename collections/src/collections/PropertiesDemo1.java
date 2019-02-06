package collections;
import java.util.*;
import java.io.*;
public class PropertiesDemo1 {

	public static void main(String[] args)throws Exception {
		Properties p = new Properties();
		p.setProperty("uname","Mounika");
		p.setProperty("upwd", "MounicA@96");
		p.setProperty("uclg","RIT");
		p.setProperty("ucontact","9100744364");
		p.setProperty("uemail","tmounika.96@gmail.com");
		FileOutputStream fos = new FileOutputStream("user.properties");
		p.store(fos,"user details");
	}

}
