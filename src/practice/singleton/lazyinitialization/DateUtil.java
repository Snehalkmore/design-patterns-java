package practice.singleton.lazyinitialization;

public class DateUtil {
	
	private static DateUtil dateUtil;
	
	private DateUtil() {
		
	}
	
	//lazy initialization
	public static DateUtil getInstance() {
		if(dateUtil==null) {
			dateUtil = new DateUtil();
		}
		return dateUtil;
	}

}
