package test1;

import java.io.FileOutputStream;


/**
 * <h2> OTest Class</h2>
 * <p>
 * Process for Displaying OTest
 * </p>
 * 
 * @author Hp
 *
 */
class OTest{
	/**
	 * <h2> str</h2>
	 * <p>
	 * str
	 * </p>
	 */
	String str = "Hello my name is moe san htet";
 
	/**
	 * <h2> writeFile</h2>
	 * <p>
	 * 	output test
	 * </p>
	 *
	 */
	public void writeFile(){
	     try {
		  //Creating FileOutputStream object.
		  //It will create a new file before writing if not exist.
		  FileOutputStream fos = 
          new FileOutputStream("D:\\Moe Swan Htet\\b.txt");
		  byte b[]=str.getBytes();  
		  fos.write(b); 
		  fos.flush();
		  //Close file after write operation.
		  fos.close();  
 
		  System.out.println("Contents written successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
 
/**
 * <h2> FileOutPutStreamExample Class</h2>
 * <p>
 * Process for Displaying FileOutPutStreamExample
 * </p>
 * 
 * @author Hp
 *
 */
public class FileOutPutStreamExample {
	/**
	 * <h2> main</h2>
	 * <p>
	 *  output display 
	 * </p>
	 *
	 * @param args
	 */
	public static void main(String args[]){
		//Creating IOTest object.
		IOTest b = new IOTest();
 
		//method call
		b.writeFile();
	}
}
