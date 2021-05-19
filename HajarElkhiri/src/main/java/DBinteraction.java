import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinteraction {
	static String url;
	static Statement st ;
	static Connection con;
	public  static void connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 url = "jdbc:mysql://localhost:3306/hajar";
		con = DriverManager.getConnection(url,"root","nevergivup");
		 st = con.createStatement();
		
	}
	
	public static  int maj(String sql) throws SQLException 
	{
		int nb=st.executeUpdate(sql);
		return nb;

	}
	
	public static ResultSet Select (String sql) throws SQLException 
	{
		ResultSet rs=st.executeQuery(sql);
		return rs;
		
	}
	public  static void disconnect() throws SQLException
	{
		con.close();
	}

	
}
