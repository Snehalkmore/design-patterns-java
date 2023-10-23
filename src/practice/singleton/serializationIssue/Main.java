package practice.singleton.serializationIssue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	// add readResolve method
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		DateUtil d1 = DateUtil.getInstance();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\sneha\\AppData\\Local\\Temp\\DateUtil.txt")));
		oos.writeObject(d1);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\sneha\\AppData\\Local\\Temp\\DateUtil.txt")));	
		DateUtil d2 = (DateUtil)ois.readObject();
		ois.close();
		
		System.out.println(d1==d2);
		
		
		

	}

}
