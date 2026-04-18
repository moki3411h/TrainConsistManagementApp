import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("===========================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        // Try changing Petroleum → Coal to test failure

        // Safety validation using stream + allMatch
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.type.equalsIgnoreCase("Cylindrical") ||
                                bogie.cargo.equalsIgnoreCase("Petroleum")
                );

        // Output result
        if (isSafe) {
            System.out.println("✅ Train is SAFE and compliant.");
        } else {
            System.out.println("❌ Train is NOT SAFE due to rule violation.");
        }
    }
}