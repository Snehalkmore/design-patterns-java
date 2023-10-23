package practice.singleton.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class Logger implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;
	
	private String fileName = "application.log";
	
	private static Logger logger ;
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(logger==null) {
			synchronized(Logger.class) {
				if(logger==null) {
					logger=new Logger();
				}
			}
		}
		return logger;
	}
	
	public void log(String message){
		try(PrintWriter printWriter = new PrintWriter(new FileWriter(fileName,true))){
			printWriter.print(message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected Object readResolve() {
		return logger;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	

}
