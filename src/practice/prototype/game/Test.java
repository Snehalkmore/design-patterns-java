package practice.prototype.game;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Game game1 = new Game();
		game1.setId(1);
		game1.setName("foo");
		
		Game game2 = game1.clone();
		
		System.out.println(game1+" hashcode "+game1.hashCode());
		System.out.println(game2+" hashcode "+game2.hashCode());
	}

}
