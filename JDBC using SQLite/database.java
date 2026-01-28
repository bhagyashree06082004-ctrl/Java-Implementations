import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet; // You'll likely need this too
import java.sql.SQLException; // To handle database errors


class Database{
	public static void main(String args[]) throws Exception {

	
		
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm = con.createStatement();
		ResultSet rs= stm.executeQuery("Select * from students");
		int dno;
		String dname;
		while(rs.next()){

		dno = rs.getInt("deptno");
		dname = rs.getString("dname");
		System.out.println(dno+" "+dname);

}
		
}
}