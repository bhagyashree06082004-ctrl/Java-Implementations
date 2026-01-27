import java.sql.*;

public class jdbc {

    static final String DB_URL = "jdbc:sqlite:univ.db";

    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");

            Connection conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connected to SQLite database.");

            Statement stmt = conn.createStatement();

            String createTable = """
                CREATE TABLE IF NOT EXISTS student (
                    id INTEGER PRIMARY KEY,
                    name TEXT NOT NULL,
                    age INTEGER,
                    department TEXT
                );
                """;
            stmt.execute(createTable);

            String insertData = """
                INSERT INTO student (name, age, department)
                VALUES
                ('Amey', 21, 'CSE'),
                ('Rahul', 22, 'ECE'),
                ('Sneha', 20, 'ME');
                """;
            stmt.executeUpdate(insertData);

            String selectQuery = "SELECT * FROM student;";
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("department")
                );
            }

            String updateQuery = """
                UPDATE student
                SET age = 23
                WHERE name = 'Rahul';
                """;
            stmt.executeUpdate(updateQuery);

            String deleteQuery = """
                DELETE FROM student
                WHERE name = 'Sneha';
                """;
            stmt.executeUpdate(deleteQuery);

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
