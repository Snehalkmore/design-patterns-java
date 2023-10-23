package practice.singleton.eagerInitialization;

public class DateUtil {
	
	private static DateUtil dateUtil = new DateUtil();
	
	//or create static block
	/*
	 *private static DateUtil dateUtil; 
	 *static { 
	 *     dateUtil = new DateUtil(); 
	 *}
	 */
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		return dateUtil;
	}

}
