package basics.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        // Logical AND (&&)
        System.out.println("Logical AND: " +
                (age >= 18 && hasLicense));

        // Logical OR (||)
        boolean hasAadhar = false;
        boolean hasPassport = true;

        System.out.println("Logical OR: " +
                (hasAadhar || hasPassport));

        // Logical NOT (!)
        boolean isRaining = false;

        System.out.println("Logical NOT: " + !isRaining);
    }
}

