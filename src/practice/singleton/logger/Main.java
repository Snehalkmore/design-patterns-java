package practice.singleton.logger;

public class Main {

	public static void main(String[] args) {


		Logger logger1 = Logger.getInstance();
		logger1.log("Snehal");
		
		Logger logger2 = Logger.getInstance();
		logger2.log(" More");
		
		System.out.println(logger1 == logger2);

	}

}
