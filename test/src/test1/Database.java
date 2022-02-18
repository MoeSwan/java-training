package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * <h2> Database Class</h2>
 * <p>
 * Process for Displaying Database
 * </p>
 * 
 * @author Hp
 *
 */
public class Database {
	/**
	 * <h2> main</h2>
	 * <p>
	 * database connected
	 * </p>
	 *
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msh", "root", "asd123!@#");
			//here msh is database name, root is username and password  
			Statement stmt = con.createStatement();
			Statement statement = con.createStatement();
			Statement statement1 = con.createStatement();
			
			//statement.executeUpdate("INSERT INTO customer " + "VALUES (5, 'd', '235235235', 'd@gmail.com')");
			statement1.executeUpdate("update customer set name='Michael Sam' where idcustomer=5");
			ResultSet rs = stmt.executeQuery("select * from customer");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
