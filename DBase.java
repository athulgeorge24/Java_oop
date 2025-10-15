bimport java.sql.*;
public class DBase {
	static final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/athul";
	
	static final String USER="Athul";
	static final String PWD="0987654321";

public static void main(String[]args) throws SQLException,ClassNotFoundException
{
	Connection con=null;
	Statement statement=null;
	try {
		Class.forName(JDBC_DRIVER);
		
		System.out.println("Connecting to Database..");
		con = DriverManager.getConnection(DB_URL, USER,PWD);
		System.out.println("Creating Database");
		statement=con.createStatement();
		
	
		String sql = "INSERT INTO user values"
                + "(2,'Sam','George',23),"
                +"(3,'Anil','Pate',21),"
                +"(1,'Ram','Naik',20)";
		int i=statement.executeUpdate(sql);
		System.out.println("Table Created,"+"value of i="+i);

	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e.getMessage());

	}
	finally {
		try {
			if(statement!=null)
				statement.close();
			if(con!=null)
				con.close();}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
//boolean result=statement.execute(sql);
//System.out.println(result);
//System.out.println("Database Created Successfully");
