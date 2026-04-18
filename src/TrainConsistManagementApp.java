import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Bogie class
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC10 - Total Seating Capacity using Streams");
        System.out.println("===========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 48));
        bogies.add(new Bogie("General", 90));

        // Stream + map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)           // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Output
        System.out.println("Total Seating Capacity: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}