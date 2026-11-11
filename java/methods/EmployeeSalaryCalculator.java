package methods;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();

        if (employeeId <= 0 || employeeName.isBlank()
                || basicSalary < 0 || hra < 0 || bonus < 0) {

            System.out.println("Invalid employee details or salary components.");

        } else {

            Employee employee = new Employee(
                    employeeId, employeeName, basicSalary, hra, bonus);

            employee.calculateSalary();

            employee.displayDetails();
        }

        sc.close();
    }
}

class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double bonus;

    private double monthlySalary;

    // Constructor 1
    public Employee(int employeeId, String employeeName) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Constructor 2
    public Employee(int employeeId, String employeeName, double basicSalary) {

        this(employeeId, employeeName);

        this.basicSalary = basicSalary;
    }

    // Constructor 3
    public Employee(int employeeId, String employeeName,
                    double basicSalary, double hra, double bonus) {

        this(employeeId, employeeName, basicSalary);

        this.hra = hra;
        this.bonus = bonus;
    }

    public void calculateSalary() {

        monthlySalary = basicSalary + hra + bonus;
    }

    public void displayDetails() {

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        System.out.println("Employee ID: " + employeeId);

        System.out.println("Employee Name: " + employeeName);

        System.out.printf("Basic Salary: Rs. %.2f%n", basicSalary);

        System.out.printf("HRA: Rs. %.2f%n", hra);

        System.out.printf("Bonus: Rs. %.2f%n", bonus);

        System.out.printf("Monthly Salary: Rs. %.2f%n", monthlySalary);

        System.out.println("============================");
    }
}
