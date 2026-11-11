package methods;

import java.util.Scanner;

public class LoanEligibilityEMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter loan tenure in months: ");
        int months = sc.nextInt();

        if (salary <= 0 || age <= 0 || months <= 0) {

            System.out.println("Invalid input. Please enter valid details.");

        } else {

            displayLoanDetails(salary, age, months);
        }

        sc.close();
    }

    public static boolean isEligible(double monthlySalary, int age) {

        return monthlySalary >= 25000 && age >= 21 && age < 60;
    }

    public static double calculateLoanAmount(double monthlySalary) {

        return monthlySalary * 20;
    }

    public static double calculateTotalInterest(double principal, int months) {

        double annualInterestRate = 12.0;

        double timeInYears = months / 12.0;

        return principal * (annualInterestRate / 100) * timeInYears;
    }

    public static double calculateEMI(double principal, int months) {

        double interest = calculateTotalInterest(principal, months);

        double totalRepayment = principal + interest;

        return totalRepayment / months;
    }

    public static void displayLoanDetails(
            double monthlySalary, int age, int months) {

        System.out.println("\n===== LOAN ELIGIBILITY DETAILS =====");

        boolean eligible = isEligible(monthlySalary, age);

        System.out.println("Loan Eligibility: " + eligible);

        if (!eligible) {

            System.out.println("Sorry! You are not eligible for this loan.");

            return;
        }

        double loanAmount = calculateLoanAmount(monthlySalary);

        double interest = calculateTotalInterest(loanAmount, months);

        double totalRepayment = loanAmount + interest;

        double emi = calculateEMI(loanAmount, months);

        System.out.printf("Eligible Loan Amount: Rs. %.2f%n", loanAmount);

        System.out.println("Loan Tenure: " + months + " months");

        System.out.printf("Total Interest: Rs. %.2f%n", interest);

        System.out.printf("Total Repayment: Rs. %.2f%n", totalRepayment);

        System.out.printf("Monthly EMI: Rs. %.2f%n", emi);

        System.out.println("====================================");
    }
}
