package practice.singleton.serializationIssue;

import java.io.Serializable;

public class DateUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static DateUtil dateUtil;
	
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
	
	//most important part
	public Object readResolve() {
		return dateUtil;
	}
	
	

}
