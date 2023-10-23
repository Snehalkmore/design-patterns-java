package practice.singleton.multithreading;

public class Main {

	public static void main(String[] args) {

		DateUtil d1=DateUtil.getInstance();
		DateUtil d2=DateUtil.getInstance();
		
		System.out.println(d1==d2);
		
	}

}
