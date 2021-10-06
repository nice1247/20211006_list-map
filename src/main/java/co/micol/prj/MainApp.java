package co.micol.prj;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.vo.DevVO;

public class MainApp {
	private static DevVO vo; // VO 객체 인스턴스 정의

	public static void main(String[] args) {
//		List<type> 이름 = new ArrayList<type>();
		List<DevVO> list = new ArrayList<DevVO>();
		vo = new DevVO();
		vo.setId(1);
		vo.setName("홍길동");
		vo.setAddress("대구광역시 중구");
		vo.setAge(20);

		list.add(vo); // array list구조에 객체 하나를 추가

		vo = new DevVO(); // (변수) 객체 초기화
		vo.setId(2);
		vo.setName("홍길순");
		vo.setAddress("대구광역시 서구");
		vo.setAge(22);

		list.add(vo);

		System.out.println(list.get(0).getId());
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getAddress());
		System.out.println(list.get(0).getAge());
		System.out.println("=========================");
		list.get(0).toString();
		list.get(1).toString();
		vo.toString();
		System.out.println("=========================");

		for (int i = 0; i < list.size(); i++) { // list 전체를 출력
			list.get(i).toString();
		}
		System.out.println("=========================");
//		for(type 이름(초기화/변수선언) : 배열)
		for (DevVO vo : list) {
			vo.toString();
		}
	}

}
