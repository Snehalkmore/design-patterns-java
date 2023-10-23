package practice.factory.person;

public class Male implements Person {

	@Override
	public void wish(String msg) {
		System.out.println(msg+" male");
	}

}
