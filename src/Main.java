package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample table data
        Map<String, Map<String, String>> programmerPreferences = new HashMap<>();
        programmerPreferences.put("p1", new Ranking().createHashMap("A", "1", "B", "2", "C", "3", "D", "4", "E", "5"));
        programmerPreferences.put("p2", new Ranking().createHashMap("E", "1", "D", "2", "C", "3", "B", "4", "A", "5"));
        programmerPreferences.put("p3", new Ranking().createHashMap("A", "1", "E", "2", "B", "3", "C", "4", "D", "5"));
        programmerPreferences.put("p4", new Ranking().createHashMap("D", "1", "B", "2", "C", "3", "A", "4", "E", "5"));
        programmerPreferences.put("p5", new Ranking().createHashMap("B", "1", "A", "2", "E", "3", "C", "4", "D", "5"));

        Map<String, Map<String, String>> companyPreferences = new HashMap<>();
        companyPreferences.put("A", new Ranking().createHashMap("p2", "1", "p1", "2", "p5", "3", "p3", "4", "p4", "5"));
        companyPreferences.put("B", new Ranking().createHashMap("p3", "1", "p4", "2", "p1", "3", "p2", "4", "p5", "5"));
        companyPreferences.put("C", new Ranking().createHashMap("p1", "1", "p2", "2", "p3", "3", "p4", "4", "p5", "5"));
        companyPreferences.put("D", new Ranking().createHashMap("p1", "1", "p3", "2", "p2", "3", "p5", "4", "p4", "5"));
        companyPreferences.put("E", new Ranking().createHashMap("p4", "1", "p5", "2", "p3", "3", "p2", "4", "p1", "5"));

        // Find a satisfactory pairing
        Map<String, String> pairing = Pairing.findSatisfactoryPairing(programmerPreferences, companyPreferences);
        System.out.println("Pairing: " + pairing);

        // Check if the pairing is satisfactory
        boolean isSatisfactory = Pairing.isPairingSatisfactory(pairing, programmerPreferences, companyPreferences);
        System.out.println("Is the pairing satisfactory? " + isSatisfactory);

        // Interactive test
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInteractive Test:");
        System.out.println("Enter the number of programmers/companies:");
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, String>> interactiveProgrammerPreferences = Ranking.getPreferencesFromInput(scanner, "programmer", n);
        Map<String, Map<String, String>> interactiveCompanyPreferences = Ranking.getPreferencesFromInput(scanner, "company", n);

        // Find a satisfactory pairing for interactive input
        Map<String, String> interactivePairing = Pairing.findSatisfactoryPairing(interactiveProgrammerPreferences, interactiveCompanyPreferences);
        System.out.println("Interactive Pairing: " + interactivePairing);

        // Check if the interactive pairing is satisfactory
        boolean isInteractiveSatisfactory = Pairing.isPairingSatisfactory(interactivePairing, interactiveProgrammerPreferences, interactiveCompanyPreferences);
        System.out.println("Is the interactive pairing satisfactory? " + isInteractiveSatisfactory);
    }
}