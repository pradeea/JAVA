import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password");
	
		Statement st=con.createStatement();
		int count=st.executeUpdate("insert into emp values(106,'frankstein',19999,'hyperloop')");
		
		System.out.println(count+" inserted succesfully");
		st.close();
		con.close();
		
	
	}

}
