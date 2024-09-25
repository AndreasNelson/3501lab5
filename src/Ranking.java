package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ranking {

    public Map<String, Integer> createHashMap(Object... args) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < args.length; i += 2) {
            map.put((String) args[i], (Integer) args[i + 1]);
        }
        return map;
    }

    // helper method for setting up user input test
    public static void setupUserInputTest(Scanner scanner, Map<String, Map<String, Integer>> programmerPreferences, Map<String, Map<String, Integer>> companyPreferences) {
        // Ask for the number of programmers/companies
        System.out.println("Enter the number of programmers/companies:");
        int numEntities = Integer.parseInt(scanner.nextLine());

        // Get programmer preferences
        for (int i = 1; i <= numEntities; i++) {
            System.out.println("Enter rankings of companies for programmer " + i + " (format: A,B,C,...):");
            String input = scanner.nextLine();
            String[] preferences = input.split(",");
            Map<String, Integer> ranking = new HashMap<>();
            for (int j = 0; j < preferences.length; j++) {
                ranking.put(preferences[j], j + 1);
            }
            programmerPreferences.put("p" + i, ranking);
        }

        // Get company preferences
        for (int i = 1; i <= numEntities; i++) {
            System.out.println("Enter rankings of programmers for company " + (char)('A' + i - 1) + " (format: p1,p2,p3,...):");
            String input = scanner.nextLine();
            String[] preferences = input.split(",");
            Map<String, Integer> ranking = new HashMap<>();
            for (int j = 0; j < preferences.length; j++) {
                ranking.put(preferences[j], j + 1);
            }
            companyPreferences.put(String.valueOf((char)('A' + i - 1)), ranking);
        }
    }
}