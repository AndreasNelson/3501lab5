package src;
import java.util.*;

public class Ranking {

    public LinkedHashMap<String, HashMap<String, String>> generatePreferences(int n) {
        LinkedHashMap<String, HashMap<String, String>> preferences = new LinkedHashMap<>();

        // Generate programmer and company names
        List<String> programmers = new ArrayList<>();
        List<String> companies = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            programmers.add("p" + i);
            companies.add("C" + i);
        }

        // Generate fixed rankings for each programmer
        for (String programmer : programmers) {
            HashMap<String, String> ranking = new HashMap<>();
            for (int i = 0; i < n; i++) {
                ranking.put(companies.get(i), String.valueOf(i + 1));
            }
            preferences.put(programmer, ranking);
        }

        // Generate fixed rankings for each company
        for (String company : companies) {
            HashMap<String, String> ranking = new HashMap<>();
            for (int i = 0; i < n; i++) {
                ranking.put(programmers.get(i), String.valueOf(i + 1));
            }
            preferences.put(company, ranking);
        }

        return preferences;
    }

    /**
     * Helper function to get preferences from user input.
     * @param scanner The Scanner object for reading input.
     * @param type The type of preferences to input ("programmer" or "company").
     * @param n The number of entities (programmers or companies).
     * @return A map representing the preferences.
     */
    public static Map<String, Map<String, String>> getPreferencesFromInput(Scanner scanner, String type, int n) {
        Map<String, Map<String, String>> preferences = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String key = type.equals("programmer") ? "p" + i : String.valueOf((char) ('A' + i - 1));
            System.out.println("Enter preferences for " + key + " in the format (entity, entity, ...):");
            String[] input = scanner.nextLine().split(", ");
            Map<String, String> ranking = new HashMap<>();
            for (int j = 0; j < input.length; j++) {
                ranking.put(input[j], String.valueOf(j + 1));
            }
            preferences.put(key, ranking);
        }

        return preferences;
    }

    /**
     * Helper function to create a HashMap from an array of strings.
     * @param args The array of strings in the format (key, value, key, value, ...).
     * @return A HashMap representing the key-value pairs.
     */
    public HashMap<String, String> createHashMap(String... args) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < args.length; i += 2) {
            map.put(args[i], args[i + 1]);
        }
        return map;
    }
}