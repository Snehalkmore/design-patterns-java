package practice.singleton.multithreading;

public class DateUtil {
	
	private static volatile DateUtil dateUtil;
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		if(dateUtil==null) {
			synchronized(DateUtil.class) {
				if(dateUtil==null) {
					dateUtil = new DateUtil();
				}		
			}
		}
		return dateUtil;
	}

}
