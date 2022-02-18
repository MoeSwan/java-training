package test1;

import java.io.FileInputStream;

/**
 * <h2>IOTest Class</h2>
 * <p>
 * Process for Displaying IOTest
 * </p>
 * 
 * @author Hp
 *
 */
class IOTest {
	/**
	 * <h2>readFile</h2>
	 * <p>
	 *  input test
	 * </p>
	 *
	 */
	public void readFile() {
		try {
			// creating FileInputStream object.
			FileInputStream fis = new FileInputStream("D:\\Moe Swan Htet\\a.txt");
			int i;
			// read file.
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeFile() {
		// TODO Auto-generated method stub

	}
}

/**
 * <h2>FileInputStreamExample Class</h2>
 * <p>
 * Process for Displaying FileInputStreamExample
 * </p>
 * 
 * @author Hp
 *
 */
public class FileInputStreamExample {
	/**
	 * <h2>main</h2>
	 * <p>
	 * 	input display 
	 * </p>
	 *
	 * @param args
	 */
	public static void main(String args[]) {
		// creating IOTest object.
		IOTest a = new IOTest();

		// method call.
		a.readFile();
	}
}
