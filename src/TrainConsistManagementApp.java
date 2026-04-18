import java.util.regex.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC11 - Regex Validation for Train ID & Cargo Code");
        System.out.println("===========================================\n");

        // Sample inputs (you can change these)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Match inputs
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Validate
        if (m1.matches()) {
            System.out.println("Train ID is valid: " + trainId);
        } else {
            System.out.println("Invalid Train ID: " + trainId);
        }

        if (m2.matches()) {
            System.out.println("Cargo Code is valid: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }

        System.out.println("\nUC11 validation completed...");
    }
}
