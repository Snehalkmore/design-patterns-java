package practice.factory.person;

public class Female implements Person {

	@Override
	public void wish(String msg) {
		System.out.println(msg+" female");
	}

}
