package co.micol.prj.vo;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
	private static Map<String, Command> map = new HashMap<String, Command>();
	public static void main(String[] args) {
		map.put("car", new Car());
		map.put("bicycle", new Bicycle());
		
		Command command = map.get("car");
		command.run();
	}

}
