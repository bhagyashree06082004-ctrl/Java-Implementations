import java.sql.*;

public class DemoDML {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

        Statement stm = con.createStatement();

        stm.executeUpdate("insert into dept values(50,'Chem')");















        stm.close();
        con.close();



        
    }
}
