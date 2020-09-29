/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
	public static Map<String, Integer> processData(ArrayList<String> array) {
		/*
		 * Modify this method to process `array` as indicated in the question. At the
		 * end, return a Map containing the appropriate values
		 *
		 * Please create appropriate classes, and use appropriate data structures as
		 * necessary.
		 *
		 * Do not print anything in this method.
		 *
		 * Submit this entire program (not just this method) as your answer
		 */

		int eid = 0;
		int esal = 0;
		int tid = 0;
		int tsal = 0;

		Map<String, Integer> retVal = new HashMap<String, Integer>();

		Iterator<String> itr = array.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			String[] data = string.split(",");
			int pk = Integer.parseInt(data[0]);
			String dept = data[2].trim();
			Integer sal = Integer.parseInt(data[3].trim());

			if (dept.contentEquals("Engineering")) {
				if (eid == 0) {
					eid = pk;
					esal = sal;
					retVal.put("Engineering", esal);
				} else {
					if (pk > eid) {
						eid = pk;
						esal = sal;
						retVal.put("Engineering", esal);
					}
				}
			} else if (dept.contentEquals("Testing")) {
				if (tid == 0) {
					tid = pk;
					tsal = sal;
					retVal.put("Testing", esal);
				} else {
					if (pk > tid) {
						eid = pk;
						tsal = sal;
						retVal.put("Testing", tsal);
					}
				}
			}

		}

		return retVal;
	}

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		String line;
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
			while (in.hasNextLine())
				inputData.add(in.nextLine());
			Map<String, Integer> retVal = processData(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
			for (Map.Entry<String, Integer> e : retVal.entrySet())
				output.println(e.getKey() + ": " + e.getValue());
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}
