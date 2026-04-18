public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("===========================================\n");

        // Available bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Search key
        String searchKey = "BG309";

        // Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop immediately when found
            }
        }

        // Output result
        if (found) {
            System.out.println("\nBogie " + searchKey + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchKey + " NOT found.");
        }

        System.out.println("\nUC18 search completed...");
    }
}