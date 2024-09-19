import java.util.*;

public class Ranking {

    public LinkedHashMap<String, HashMap<String, String>> generateRandomPreferences(int n) {
        Random random = new Random();
        LinkedHashMap<String, HashMap<String, String>> preferences = new LinkedHashMap<>();

        // Generate programmer and company names
        List<String> programmers = new ArrayList<>();
        List<String> companies = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            programmers.add("p" + i);
            companies.add("C" + i);
        }

        // Generate random rankings for each programmer
        for (String programmer : programmers) {
            HashMap<String, String> ranking = new HashMap<>();
            List<String> shuffledCompanies = new ArrayList<>(companies);
            Collections.shuffle(shuffledCompanies, random);
            for (int i = 0; i < n; i++) {
                ranking.put(shuffledCompanies.get(i), String.valueOf(i + 1));
            }
            preferences.put(programmer, ranking);
        }

        // Generate random rankings for each company
        for (String company : companies) {
            HashMap<String, String> ranking = new HashMap<>();
            List<String> shuffledProgrammers = new ArrayList<>(programmers);
            Collections.shuffle(shuffledProgrammers, random);
            for (int i = 0; i < n; i++) {
                ranking.put(shuffledProgrammers.get(i), String.valueOf(i + 1));
            }
            preferences.put(company, ranking);
        }

        return preferences;
    }

    public void printPreferences(LinkedHashMap<String, HashMap<String, String>> preferences) {
        for (Map.Entry<String, HashMap<String, String>> entry : preferences.entrySet()) {
            String name = entry.getKey();
            HashMap<String, String> map = entry.getValue();
            System.out.println("Name: " + name);
            System.out.println("Rankings: " + map);
        }
    }

    // Existing createHashMap method
    public HashMap<String, String> createHashMap(String... args) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < args.length; i += 2) {
            map.put(args[i], args[i + 1]);
        }
        return map;
    }
}