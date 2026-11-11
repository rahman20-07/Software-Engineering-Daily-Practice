package methods;

import java.util.Scanner;

public class EmployeeSalarySlipCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        if (basicSalary < 0) {

            System.out.println("Invalid salary. Salary cannot be negative.");

        } else {

            displaySalarySlip(basicSalary);
        }

        sc.close();
    }

    public static double calculateHRA(double basicSalary) {

        return 0.20 * basicSalary;
    }

    public static double calculateDA(double basicSalary) {

        return 0.10 * basicSalary;
    }

    public static double calculatePF(double basicSalary) {

        return 0.12 * basicSalary;
    }

    public static double calculateTakeHomeSalary(double basicSalary) {

        return basicSalary
                + calculateHRA(basicSalary)
                + calculateDA(basicSalary)
                - calculatePF(basicSalary);
    }

    public static void displaySalarySlip(double basicSalary) {

        System.out.println("\n======= EMPLOYEE SALARY SLIP =======");

        System.out.printf("Basic Salary: Rs. %.2f%n", basicSalary);

        System.out.printf("HRA: Rs. %.2f%n", calculateHRA(basicSalary));

        System.out.printf("DA: Rs. %.2f%n", calculateDA(basicSalary));

        System.out.printf("PF Deduction: Rs. %.2f%n", calculatePF(basicSalary));

        System.out.printf("Take-home Salary: Rs. %.2f%n",
                calculateTakeHomeSalary(basicSalary));

        System.out.println("===================================");
    }
}
