package Bad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListUsers {
	String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
	String user = "testuser";
	String password = "test623";
	String query = "selct 8 from emp where created_dt>today";
	
	public void sendMail()	
	{
		try {
			
		    Connection con = DriverManager.getConnection(url, user, password);
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(query);
		}
		catch(Exception e){
			
		}
	}
		
}
