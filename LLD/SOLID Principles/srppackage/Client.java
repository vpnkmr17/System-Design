package srppackage;

public class Client {
    
    public static void main(String[] args) {
        Employee empObj = new Employee("Test", 23);
        empObj.setSalary(50000.00);
        EmployeeDAO empDaoObj = new EmployeeDAO();
        empDaoObj.saveToDatabase(empObj);
    }
}
