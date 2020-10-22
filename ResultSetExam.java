import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExam {

	public static void main(String[] args) throws Exception{
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","username","password");
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	ResultSet rs=st.executeQuery("select * from emp");
		
	System.out.println("-----------------------------------------------------");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+ "   " +rs.getString(3)+ "   " +rs.getString(4));
		
		
	}
	System.out.println("-----------------------------------------------------");	
	while(rs.previous())
	{
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+ "   " +rs.getString(3)+ "   " +rs.getString(4));
		
		
	}
	
	System.out.println("-----------------------------------------------------");	
	rs.absolute(3);
	{
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+ "   " +rs.getString(3)+ "   " +rs.getString(4));
		
		
	}
	System.out.println("-----------------------------------------------------");
	rs.relative(-1);
	{
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+ "   " +rs.getString(3)+ "   " +rs.getString(4));
		
		
	}
		st.close();
		con.close();

	}

}
