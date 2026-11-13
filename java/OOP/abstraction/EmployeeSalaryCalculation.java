package oop.abstraction;

import java.util.Scanner;

public class EmployeeSalaryCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EMPLOYEE SALARY SYSTEM =====");
        System.out.println("1. Permanent Employee");
        System.out.println("2. Contract Employee");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Employee employee = null;

        switch (choice) {

            case 1 -> {

                System.out.print("Employee ID: ");
                int employeeId = sc.nextInt();
                sc.nextLine();

                System.out.print("Employee Name: ");
                String employeeName = sc.nextLine();

                System.out.print("Basic Salary: ");
                double basicSalary = sc.nextDouble();

                System.out.print("Allowance: ");
                double allowance = sc.nextDouble();

                if (!isValidEmployee(employeeId, employeeName, basicSalary)
                        || allowance < 0) {

                    System.out.println("Invalid employee details!");
                    sc.close();
                    return;
                }

                employee = new PermanentEmployee(
                        employeeId, employeeName, basicSalary, allowance
                );
            }

            case 2 -> {

                System.out.print("Employee ID: ");
                int employeeId = sc.nextInt();
                sc.nextLine();

                System.out.print("Employee Name: ");
                String employeeName = sc.nextLine();

                System.out.print("Basic Salary: ");
                double basicSalary = sc.nextDouble();

                System.out.print("Working Days: ");
                double workingDays = sc.nextDouble();

                System.out.print("Daily Wage: ");
                double dailyWage = sc.nextDouble();

                if (!isValidEmployee(employeeId, employeeName, basicSalary)
                        || workingDays < 0 || dailyWage < 0) {

                    System.out.println("Invalid employee details!");
                    sc.close();
                    return;
                }

                employee = new ContractEmployee(
                        employeeId,
                        employeeName,
                        basicSalary,
                        workingDays,
                        dailyWage
                );
            }

            default -> {
                System.out.println("Invalid employee type!");
                sc.close();
                return;
            }
        }

        // Runtime polymorphism
        employee.displayDetails();

        sc.close();
    }

    private static boolean isValidEmployee(
            int employeeId, String employeeName, double basicSalary) {

        return employeeId > 0
                && employeeName != null
                && !employeeName.isBlank()
                && basicSalary >= 0;
    }
}

abstract class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);

        System.out.printf("Basic Salary: Rs. %.2f%n", basicSalary);

        System.out.printf(
                "Total Salary: Rs. %.2f%n",
                calculateSalary()
        );
    }
}

class PermanentEmployee extends Employee {

    private double allowance;

    PermanentEmployee(
            int employeeId,
            String employeeName,
            double basicSalary,
            double allowance) {

        super(employeeId, employeeName, basicSalary);

        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {

        return getBasicSalary() + allowance;
    }
}

class ContractEmployee extends Employee {

    private double workingDays;
    private double dailyWage;

    ContractEmployee(
            int employeeId,
            String employeeName,
            double basicSalary,
            double workingDays,
            double dailyWage) {

        super(employeeId, employeeName, basicSalary);

        this.workingDays = workingDays;
        this.dailyWage = dailyWage;
    }

    @Override
    public double calculateSalary() {

        return workingDays * dailyWage;
    }
}
