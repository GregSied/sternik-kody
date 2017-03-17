package pl.sages.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {

	
//	Host: sql11.freesqldatabase.com
//	Database name: sql11164291
//	Database user: sql11164291
//	Database password: jFatCW7ETn
//	Port number: 3306

//	CREATE TABLE student (
//            id INT NOT NULL AUTO_INCREMENT,
//            name VARCHAR(40) NOT NULL,
//            surname VARCHAR(40),
//            student_grup VARCHAR(40) NOT NULL,
//            PRIMARY KEY (ID)
//    );

	
	public static void main(String[] args)
	  {
	    try
	    {
	      // create our mysql database connection
	      String myDriver = "com.mysql.cj.jdbc.Driver";
	      String myUrl = "jdbc:mysql://sql11.freesqldatabase.com/sql11164291";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "sql11164291", "jFatCW7ETn");
	      
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      String query = "SELECT * FROM student";

	      // create the java statement
	      Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	        int id = rs.getInt("id");
	        String name = rs.getString("name");
	        String surname = rs.getString("surname");
	        String student_grup = rs.getString("student_grup");
	        
	        // print the results
	        System.out.format("%s, %s, %s, %s\n", id, name, surname, student_grup);
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	  }
}
