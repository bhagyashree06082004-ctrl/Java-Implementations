package Employee;

public class EmployeeDAO {
    //save and delete employee
    public void saveEmployee(Employee emp) {
        
        System.out.println("Employee saved: " + emp);
    }
    public void deleteEmployee(Employee emp) {
        System.out.println("Employee deleted: " + emp);
    }
}
