package co.micol.prj;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class MainApp07 {
	private static Properties properties = new Properties();; // 사용할 properties 객체 정의 및 초기화

	public static void main(String[] args) {
		File path = new File("src/main/resources/info.properties"); // 파일경로 설정
		FileReader file; // 파일내용을 읽어들이는 객체
		try {
			file = new FileReader(path); // properties를 읽어 들임
			properties.load(file); // properties 객체에 저장 map.put()
			System.out.println(properties.getProperty("name"));
			System.out.println(properties.getProperty("tel"));
			System.out.println(properties.getProperty("address"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
