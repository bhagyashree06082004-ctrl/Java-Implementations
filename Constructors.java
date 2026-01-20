
class Employee {

    private int id;
    private String name;
    private double salary;

   
    Employee() {
        this(0, "Not Assigned", 0.0); 
    }

    
    Employee(int id, String name) {
        this(id, name, 0.0);
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

  
    Employee(Employee e) {
        this(e.id, e.name, e.salary);
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}


public class Constructors {
    public static void main(String[] args) {

        Employee e1 = new Employee();                  
        Employee e2 = new Employee(101, "Amit");       
        Employee e3 = new Employee(102, "Riya", 50000);
        Employee e4 = new Employee(e3);                

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
