import java.util.*;

public static void main(String[] args) {
    Ranking rankingHelper = new Ranking();

    // Generate random preferences for 3 programmers and 3 companies
    LinkedHashMap<String, HashMap<String, String>> preferences = rankingHelper.generateRandomPreferences(5);

    // Print the preferences using the new printPreferences method
    rankingHelper.printPreferences(preferences);
}