package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CLITesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize preference maps
        Map<String, Map<String, Integer>> programmerPreferences = new HashMap<>();
        Map<String, Map<String, Integer>> companyPreferences = new HashMap<>();

        // Setup user input test
        Ranking.setupUserInputTest(scanner, programmerPreferences, companyPreferences);

        // Find a satisfactory pairing with user input
        Map<String, String> pairing = Pairing.findSatisfactoryPairing(programmerPreferences, companyPreferences);
        System.out.println("Pairing with user input: " + pairing);

        // Check if the pairing is satisfactory with user input
        boolean isSatisfactory = Pairing.isPairingSatisfactory(pairing, programmerPreferences, companyPreferences);
        System.out.println("Is the pairing satisfactory with user input? " + isSatisfactory);

        scanner.close();
    }
}