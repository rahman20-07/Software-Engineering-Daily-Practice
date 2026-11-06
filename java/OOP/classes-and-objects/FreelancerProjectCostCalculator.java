import java.util.Scanner;

public class FreelancerProjectCostCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String projectID = sc.nextLine();
        String freelancerName = sc.nextLine();

        int hoursWorked = sc.nextInt();
        double hourlyRate = sc.nextDouble();

        // Input validation
        if (hoursWorked <= 0 || hourlyRate < 0) {
            System.out.println("Error: Invalid project details.");
            sc.close();
            return;
        }

        Project project = new Project(
                projectID,
                freelancerName,
                hoursWorked,
                hourlyRate
        );

        project.displayProjectDetails();

        sc.close();
    }
}

class Project {

    private String projectID;
    private String freelancerName;

    private int hoursWorked;
    private double hourlyRate;

    Project(String projectID, String freelancerName,
            int hoursWorked, double hourlyRate) {

        this.projectID = projectID;
        this.freelancerName = freelancerName;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateTotalCost() {

        return hoursWorked * hourlyRate;
    }

    void displayProjectDetails() {

        System.out.println("Project ID: " + projectID);
        System.out.println("Freelancer: " + freelancerName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);

        System.out.printf(
                "Total Cost: %.2f%n",
                calculateTotalCost()
        );
    }
}
