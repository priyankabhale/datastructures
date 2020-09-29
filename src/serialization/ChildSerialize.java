package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ChildSerialize implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		ChildSerialize p = new ChildSerialize();
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\breport/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
