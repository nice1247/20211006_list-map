package co.micol.prj;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.vo.DevVO;

public class MainApp2 {
//	private static MapTest mapTest;
	public static void main(String[] args) {
//		mapTest = new MapTest(); // 인스턴스 초기화/생성
//		mapTest.setMap("mico", "1234");
//		mapTest.setMap("park", "1111");
//		mapTest.setMap("sam", "2222");
//		mapTest.setMap("lee", "3333");
//		
//		String pw = mapTest.getMap("mico");
//		System.out.println(pw);
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("age", 23);
//		map.put("id", 22);
//		
//		int age = map.get("age");
//		System.out.println(age);
//		System.out.println(map.get("id"));
		
		Map<String, DevVO> mapVo = new HashMap<String, DevVO>();
		DevVO vo = new DevVO();
		vo.setId(1);
		vo.setName("홍길동");
		vo.setAddress("서울");
		vo.setAge(20);
		
		mapVo.put("홍길동", vo);
		vo = new DevVO();
		vo.setId(2);
		vo.setName("박수동");
		vo.setAddress("대구");
		vo.setAge(23);
		mapVo.put("박수동", vo);
		
		DevVO vo1 = new DevVO();
		vo1 = mapVo.get("박수동");
		vo1.toString();
		
		
	}

}
