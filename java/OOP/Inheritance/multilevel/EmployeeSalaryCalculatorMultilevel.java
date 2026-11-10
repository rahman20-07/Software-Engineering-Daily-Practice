package oop.inheritance.multilevel;

import java.util.Scanner;

public class EmployeeSalaryCalculatorMultilevel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID, Name, Basic Salary, HRA, DA and Monthly Deduction:");

        int id = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        double basicSalary = sc.nextDouble();
        double hra = sc.nextDouble();
        double da = sc.nextDouble();
        double monthlyDeduction = sc.nextDouble();

        SeniorEmployee emp = new SeniorEmployee(
            id, name, basicSalary, monthlyDeduction
        );

        emp.displayEmployeeDetails();

        System.out.printf("Gross Salary: %.2f%n",
                emp.calculateGrossSalary(hra, da));

        System.out.printf("Net Salary: %.2f%n",
                emp.calculateNetSalary(hra, da));

        sc.close();
    }
}

class Employee {

    protected int empId;
    protected String empName;

    public Employee(int empId, String empName) {

        this.empId = empId;
        this.empName = empName;
    }

    public void displayEmployeeDetails() {

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

class RegularEmployee extends Employee {

    protected double basicSalary;

    public RegularEmployee(int empId, String empName,
                           double basicSalary) {

        super(empId, empName);
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary(double hra, double da) {

        return basicSalary + hra + da;
    }

    @Override
    public void displayEmployeeDetails() {

        super.displayEmployeeDetails();

        System.out.printf("Basic Salary: %.2f%n", basicSalary);
    }
}

class SeniorEmployee extends RegularEmployee {

    private double monthlyDeduction;

    public SeniorEmployee(int empId, String empName,
                          double basicSalary, double monthlyDeduction) {

        super(empId, empName, basicSalary);
        this.monthlyDeduction = monthlyDeduction;
    }

    public double calculateNetSalary(double hra, double da) {

        return calculateGrossSalary(hra, da) - monthlyDeduction;
    }

    @Override
    public void displayEmployeeDetails() {

        super.displayEmployeeDetails();

        System.out.printf("Monthly Deduction: %.2f%n", monthlyDeduction);
    }
}
