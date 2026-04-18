import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("===========================================\n");

        // Sorted bogie IDs (IMPORTANT for binary search)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Print available IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Search key
        String searchKey = "BG309";

        // Binary Search
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }

        // Output result
        if (found) {
            System.out.println("\nBogie " + searchKey + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + searchKey + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}