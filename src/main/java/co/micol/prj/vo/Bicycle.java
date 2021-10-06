package co.micol.prj.vo;

public class Bicycle implements Command {

	@Override
	public void run() {
		System.out.println("자전거 타기");
	}

}
