package practice.factory.person;

public class PersonFactory {
	
	public static Person personWish(String msg) {
		Person p = null;
		if(msg.contains("female")) {
			p = new Female();
		}else if(msg.contains("male")) {
			p = new Male();
		}
		return p;
	}

}
