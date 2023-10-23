package practice.singleton.eagerInitialization;

import practice.singleton.lazyinitialization.DateUtil;

public class Main {

	public static void main(String[] args) {
		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = DateUtil.getInstance();
		
		System.out.println(dateUtil1==dateUtil2); //reference check in memory
	

	}

}
