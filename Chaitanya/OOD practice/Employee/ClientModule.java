package Employee;

public class ClientModule {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "HR");
        Employee emp2 = new Employee(2, "Bob", "IT");

        hireEmployee(emp1);
        hireEmployee(emp2);

        terminateEmployee(emp1);
    }
    public static void hireEmployee(Employee emp) {
        
        EmployeeDAO dao = new EmployeeDAO();
        dao.saveEmployee(emp);
        System.out.println("Hired new employee: " + emp);
    }
    public static void terminateEmployee(Employee emp) {
        EmployeeDAO dao = new EmployeeDAO();
        dao.deleteEmployee(emp);
        System.out.println("Terminated employee: " + emp);
    }

 
}
