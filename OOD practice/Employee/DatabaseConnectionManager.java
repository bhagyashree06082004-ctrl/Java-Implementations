package Employee;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private String connectionString;

    private DatabaseConnectionManager() {
        // Initialize connection string or other resources
        this.connectionString = "jdbc:mysql://localhost:3306/employees_db";
    }

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public String getConnectionString() {
        return connectionString;
    }   
}
