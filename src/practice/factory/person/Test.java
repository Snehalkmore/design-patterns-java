package practice.factory.person;

public class Test {
	
	public static void main(String[] args) {
		Person person = PersonFactory.personWish("female");
		person.wish("You are selected. Gender : ");
	}

}
