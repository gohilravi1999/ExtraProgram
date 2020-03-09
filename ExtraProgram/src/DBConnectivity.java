import java.sql.*;

public class DBConnectivity {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root@123");
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery("Select * from student");
			
			while(result.next())
			{
				System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getInt(3));  
				connection.close();  
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
