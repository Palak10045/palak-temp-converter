import java.util.Scanner;
public class Employee {

    private int empid;
    private String empname;
    private String designation;
    private double salary;

    public Employee(int empid, String empname, String designation, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
    }

    public static Employee getEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int empid = scanner.nextInt();

        System.out.println("Enter Employee Name:");
        String empname = scanner.next();

        System.out.println("Enter Designation:");
        String designation = scanner.next();

        System.out.println("Enter Salary:");
        double salary = scanner.nextDouble();

        return new Employee(empid, empname, designation, salary);
    }

    public String grade() {
        if (salary >= 50000) {
            return "A";
        } else if (salary >= 30000 && salary < 50000) {
            return "B";
        } else if (salary >= 20000 && salary < 30000) {
            return "C";
        } else {
            return "D";
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade());
    }

    public static void main(String[] args) {
        Employee employee = getEmployee();
        employee.displayEmployeeDetails();
    }
}
