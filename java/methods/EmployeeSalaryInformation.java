package methods;

public class EmployeeSalaryInformation {

    public static void main(String[] args) {

        CompanyEmployeeRecord e1 = new CompanyEmployeeRecord();

        e1.employeeId = 1;
        e1.employeeName = "Yash";
        e1.monthlySalary = 100000.0;

        CompanyEmployeeRecord e2 = new CompanyEmployeeRecord();

        e2.employeeId = 2;
        e2.employeeName = "Employee Two";
        e2.monthlySalary = 10000.0;

        // Static method called using class name
        CompanyEmployeeRecord.displayCompanyDetails();

        System.out.println("\n===== EMPLOYEE 1 =====");
        e1.displayEmployeeDetails();
        System.out.printf("Annual Salary: Rs. %.2f%n",
                e1.calculateAnnualSalary());

        System.out.println("\n===== EMPLOYEE 2 =====");
        e2.displayEmployeeDetails();
        System.out.printf("Annual Salary: Rs. %.2f%n",
                e2.calculateAnnualSalary());
    }
}

class CompanyEmployeeRecord {

    // Static variables shared by all employee objects
    static String companyName = "Tata Trust Company";
    static int workingHoursPerDay = 8;

    // Instance variables: separate for each employee
    int employeeId;
    String employeeName;
    double monthlySalary;

    public static void displayCompanyDetails() {

        System.out.println("Company Name: " + companyName);
        System.out.println("Working Hours per Day: " + workingHoursPerDay);
    }

    public void displayEmployeeDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Monthly Salary: Rs. %.2f%n", monthlySalary);
    }

    public double calculateAnnualSalary() {

        return monthlySalary * 12;
    }
}
