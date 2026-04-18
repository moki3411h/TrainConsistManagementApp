public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC20 - Prevent Search on Empty Train");
        System.out.println("===========================================\n");

        // Empty bogie list (simulate no data)
        String[] bogieIds = {};

        // Search key
        String searchKey = "BG309";

        // Defensive check (FAIL-FAST)
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in train. Cannot perform search.");
        }

        // (This part will not execute if empty)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie " + searchKey + " found.");
        } else {
            System.out.println("Bogie " + searchKey + " NOT found.");
        }

        System.out.println("\nUC20 completed...");
    }
}