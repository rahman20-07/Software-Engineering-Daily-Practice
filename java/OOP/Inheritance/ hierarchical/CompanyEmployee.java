package oop.inheritance.hierarchical;

import java.util.Scanner;

public class CompanyEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Type: Developer or Tester");
        String type = sc.next();

        System.out.println("Enter Employee ID, Name and Salary:");

        int id = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        double salary = sc.nextDouble();

        Employee emp = null;

        if (type.equalsIgnoreCase("Developer")) {

            System.out.println("Enter Technical Allowance:");
            double technicalAllowance = sc.nextDouble();

            emp = new Developer(id, name, salary, technicalAllowance);

        } else if (type.equalsIgnoreCase("Tester")) {

            System.out.println("Enter Testing Allowance:");
            double testingAllowance = sc.nextDouble();

            emp = new Tester(id, name, salary, testingAllowance);

        } else {

            System.out.println("Invalid Employee Type!");
            sc.close();
            return;
        }

        System.out.println("\n----- Employee Details -----");

        emp.displayDetails();

        System.out.printf("Gross Salary: %.2f%n",
                emp.calculateGrossSalary());

        sc.close();
    }
}

class Employee {

    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateGrossSalary() {

        return salary;
    }

    public void displayDetails() {

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
    }
}

class Developer extends Employee {

    private double technicalAllowance;

    public Developer(int id, String name, double salary,
                     double technicalAllowance) {

        super(id, name, salary);

        this.technicalAllowance = technicalAllowance;
    }

    @Override
    public double calculateGrossSalary() {

        return super.calculateGrossSalary() + technicalAllowance;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Employee Type: Developer");
        System.out.println("Technical Allowance: " + technicalAllowance);
    }
}

class Tester extends Employee {

    private double testingAllowance;

    public Tester(int id, String name, double salary,
                  double testingAllowance) {

        super(id, name, salary);

        this.testingAllowance = testingAllowance;
    }

    @Override
    public double calculateGrossSalary() {

        return super.calculateGrossSalary() + testingAllowance;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Employee Type: Tester");
        System.out.println("Testing Allowance: " + testingAllowance);
    }
}
