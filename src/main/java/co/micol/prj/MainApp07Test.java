package co.micol.prj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class MainApp07Test {
	private static Properties properties = new Properties();
	
	public static void main(String[] args) {
		File path = new File("src/main/resources/protest");
		FileReader file;
		try {
			file = new FileReader(path);
			properties.load(file);
			System.out.println(properties.getProperty("id"));
			System.out.println(properties.getProperty("password"));
			System.out.println(properties.getProperty("name"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
