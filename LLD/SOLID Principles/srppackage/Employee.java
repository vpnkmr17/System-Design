package srppackage;

/* 
 * To Handle Employee Details
 */
public class Employee {
    private String name;
    private Integer age;
    private Double salary;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return this.salary;
    }

}
