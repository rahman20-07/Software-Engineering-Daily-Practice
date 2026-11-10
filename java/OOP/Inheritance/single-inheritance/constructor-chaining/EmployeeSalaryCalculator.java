package oop.inheritance.constructorchaining;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee ID, Name, Basic Salary and Allowance Percentage:");

        int employeeId = sc.nextInt();
        sc.nextLine();

        String employeeName = sc.nextLine();

        double basicSalary = sc.nextDouble();
        double allowancePercentage = sc.nextDouble();

        PermanentEmployee emp = new PermanentEmployee(
            employeeId,
            employeeName,
            basicSalary,
            allowancePercentage
        );

        emp.displayDetails();

        sc.close();
    }
}

class Employee {

    protected int employeeId;
    protected String employeeName;
    protected double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {

    private double allowancePercentage;

    public PermanentEmployee(int employeeId, String employeeName,
                             double basicSalary, double allowancePercentage) {

        super(employeeId, employeeName, basicSalary);

        this.allowancePercentage = allowancePercentage;
    }

    public double calculateAllowance() {

        return basicSalary * allowancePercentage / 100;
    }

    public double calculateGrossSalary() {

        return basicSalary + calculateAllowance();
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Allowance Percentage: " + allowancePercentage);
        System.out.println("Allowance: " + calculateAllowance());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}
