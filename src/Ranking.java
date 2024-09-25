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

    public static Map<String, Map<String, Integer>> getPreferencesFromInput(Scanner scanner, String type, int n) {
        Map<String, Map<String, Integer>> preferences = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter preferences for " + type + " " + (i + 1) + ":");
            Map<String, Integer> ranking = new HashMap<>();
            for (int j = 0; j < n; j++) {
                System.out.println("Enter preference " + (j + 1) + ":");
                String key = scanner.nextLine();
                ranking.put(key, j + 1);
            }
            preferences.put(type + (i + 1), ranking);
        }
        return preferences;
    }

    /**
     * Helper function to create a HashMap from an array of strings.
     * @param args The array of strings in the format (key, value, key, value, ...).
     * @return A HashMap representing the key-value pairs.
     */
    public static HashMap<String, String> createHashMap(String... args) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < args.length; i += 2) {
            map.put(args[i], args[i + 1]);
        }
        return map;
    }
}