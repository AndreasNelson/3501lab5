package src;

import java.util.HashMap;
import java.util.Map;

public class StaticTest {
    public static void main(String[] args) {
        // Sample table data for n = 5
        Map<String, Map<String, Integer>> programmerPreferences = new HashMap<>();
        programmerPreferences.put("p1", new Ranking().createHashMap("E", 1, "A", 2, "D", 3, "B", 4, "C", 5));
        programmerPreferences.put("p2", new Ranking().createHashMap("D", 1, "E", 2, "B", 3, "A", 4, "C", 5));
        programmerPreferences.put("p3", new Ranking().createHashMap("D", 1, "B", 2, "C", 3, "E", 4, "A", 5));
        programmerPreferences.put("p4", new Ranking().createHashMap("C", 1, "B", 2, "D", 3, "A", 4, "E", 5));
        programmerPreferences.put("p5", new Ranking().createHashMap("A", 1, "D", 2, "B", 3, "C", 4, "E", 5));

        Map<String, Map<String, Integer>> companyPreferences = new HashMap<>();
        companyPreferences.put("A", new Ranking().createHashMap("p2", 1, "p5", 2, "p1", 3, "p3", 4, "p4", 5));
        companyPreferences.put("B", new Ranking().createHashMap("p1", 1, "p2", 2, "p3", 3, "p4", 4, "p5", 5));
        companyPreferences.put("C", new Ranking().createHashMap("p5", 1, "p3", 2, "p2", 3, "p1", 4, "p4", 5));
        companyPreferences.put("D", new Ranking().createHashMap("p1", 1, "p3", 2, "p2", 3, "p4", 4, "p5", 5));
        companyPreferences.put("E", new Ranking().createHashMap("p2", 1, "p3", 2, "p5", 3, "p4", 4, "p1", 5));

        // Find a satisfactory pairing
        Map<String, String> pairing = Pairing.findSatisfactoryPairing(programmerPreferences, companyPreferences);
        System.out.println("Pairing: " + pairing);

        // Check if the pairing is satisfactory
        boolean isSatisfactory = Pairing.isPairingSatisfactory(pairing, programmerPreferences, companyPreferences);
        System.out.println("Is the pairing satisfactory? " + isSatisfactory);

        // Sample table data for n = 2
        programmerPreferences = new HashMap<>();
        programmerPreferences.put("p1", new Ranking().createHashMap("A", 1, "B", 2));
        programmerPreferences.put("p2", new Ranking().createHashMap("B", 1, "A", 2));

        companyPreferences = new HashMap<>();
        companyPreferences.put("A", new Ranking().createHashMap("p2", 1, "p1", 2));
        companyPreferences.put("B", new Ranking().createHashMap("p1", 1, "p2", 2));

        // Find a satisfactory pairing
        pairing = Pairing.findSatisfactoryPairing(programmerPreferences, companyPreferences);
        System.out.println("Pairing for n=2: " + pairing);

        // Check if the pairing is satisfactory
        isSatisfactory = Pairing.isPairingSatisfactory(pairing, programmerPreferences, companyPreferences);
        System.out.println("Is the pairing satisfactory for n=2? " + isSatisfactory);

        // Sample table data for n = 3
        programmerPreferences = new HashMap<>();
        programmerPreferences.put("p1", new Ranking().createHashMap("A", 1, "B", 2, "C", 3));
        programmerPreferences.put("p2", new Ranking().createHashMap("B", 1, "C", 2, "A", 3));
        programmerPreferences.put("p3", new Ranking().createHashMap("C", 1, "A", 2, "B", 3));

        companyPreferences = new HashMap<>();
        companyPreferences.put("A", new Ranking().createHashMap("p3", 1, "p1", 2, "p2", 3));
        companyPreferences.put("B", new Ranking().createHashMap("p1", 1, "p2", 2, "p3", 3));
        companyPreferences.put("C", new Ranking().createHashMap("p2", 1, "p3", 2, "p1", 3));

        // Find a satisfactory pairing
        pairing = Pairing.findSatisfactoryPairing(programmerPreferences, companyPreferences);
        System.out.println("Pairing for n=3: " + pairing);

        // Check if the pairing is satisfactory
        isSatisfactory = Pairing.isPairingSatisfactory(pairing, programmerPreferences, companyPreferences);
        System.out.println("Is the pairing satisfactory for n=3? " + isSatisfactory);

        // Sample table data for n = 4
        programmerPreferences = new HashMap<>();
        programmerPreferences.put("p1", new Ranking().createHashMap("A", 1, "B", 2, "C", 3, "D", 4));
        programmerPreferences.put("p2", new Ranking().createHashMap("B", 1, "C", 2, "D", 3, "A", 4));
        programmerPreferences.put("p3", new Ranking().createHashMap("C", 1, "D", 2, "A", 3, "B", 4));
        programmerPreferences.put("p4", new Ranking().createHashMap("D", 1, "A", 2, "B", 3, "C", 4));

        companyPreferences = new HashMap<>();
        companyPreferences.put("A", new Ranking().createHashMap("p4", 1, "p3", 2, "p2", 3, "p1", 4));
        companyPreferences.put("B", new Ranking().createHashMap("p1", 1, "p2", 2, "p3", 3, "p4", 4));
        companyPreferences.put("C", new Ranking().createHashMap("p2", 1, "p3", 2, "p4", 3, "p1", 4));
        companyPreferences.put("D", new Ranking().createHashMap("p3", 1, "p4", 2, "p1", 3, "p2", 4));

        // Find a satisfactory pairing
        pairing = Pairing.findSatisfactoryPairing(programmerPreferences, companyPreferences);
        System.out.println("Pairing for n=4: " + pairing);

        // Check if the pairing is satisfactory
        isSatisfactory = Pairing.isPairingSatisfactory(pairing, programmerPreferences, companyPreferences);
        System.out.println("Is the pairing satisfactory for n=4? " + isSatisfactory);
    }
}