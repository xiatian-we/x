package µÇÂ¼½çÃæ;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	 public  Connection getConnection() throws ClassNotFoundException {
		  String url = "jdbc:mysql://localhost:3306/mesdb";
		  String name = "root";
		  String passw = "123456";
		  Class.forName("com.mysql.jdbc.Driver");
		  try {
		   Connection conn=DriverManager.getConnection(url,name,passw);
		   return conn;
		  } catch (Exception e) {
		   e.printStackTrace();
		   return null;
		  }
		 }

}
