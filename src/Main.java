class Employee {
    private String name;
    private double salary;
    private String idNumber;
    public Employee(String name, double salary, String idNumber) {
        this.name = name;
        this.salary = salary;
        this.idNumber = idNumber;

    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public void setName(String name) {
        this.name = name;
    }

}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Abdul", 20000.0, "12aab");
        System.out.println("Employee Details: initial Details");
        System.out.println(emp.getIdNumber() + " ," + emp.getName() + " ," + emp.getSalary());
        emp.setName("sir jalad");
        emp.setIdNumber("bj75");
        emp.setSalary(90000.0);
        System.out.println("Employeee Details: New Details");
        System.out.println(emp.getIdNumber() + " ," + emp.getName() + ", " + emp.getSalary());

    }
}