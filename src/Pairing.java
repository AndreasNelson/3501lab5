package src;
import java.util.*;

public class Pairing {

    public static Map<String, String> findSatisfactoryPairing(Map<String, Map<String, String>> programmerPreferences, Map<String, Map<String, String>> companyPreferences) {
        Set<String> freeProgrammers = new HashSet<>(programmerPreferences.keySet());
        Map<String, String> companyMatches = new HashMap<>();
        for (String company : companyPreferences.keySet()) {
            companyMatches.put(company, null);
        }

        while (!freeProgrammers.isEmpty()) {
            String programmer = freeProgrammers.iterator().next();
            freeProgrammers.remove(programmer);

            for (String company : programmerPreferences.get(programmer).keySet()) {
                if (companyMatches.get(company) == null) {
                    companyMatches.put(company, programmer);
                    break;
                } else {
                    String currentMatch = companyMatches.get(company);
                    if (companyPreferences.get(company).get(programmer).compareTo(companyPreferences.get(company).get(currentMatch)) < 0) {
                        // Print the unsatisfactory pairing before replacing it
                        System.out.println("Unsatisfactory pairing: " + company + " with " + currentMatch);
                        companyMatches.put(company, programmer);
                        freeProgrammers.add(currentMatch);
                        break;
                    }
                }
            }
        }

        return companyMatches;
    }

    public static boolean isPairingSatisfactory(Map<String, String> pairing, Map<String, Map<String, String>> programmerPreferences, Map<String, Map<String, String>> companyPreferences) {
        for (Map.Entry<String, String> entry : pairing.entrySet()) {
            String company = entry.getKey();
            String programmer = entry.getValue();

            for (String otherCompany : programmerPreferences.get(programmer).keySet()) {
                if (otherCompany.equals(company)) {
                    break;
                }

                String otherProgrammer = pairing.get(otherCompany);
                if (companyPreferences.get(otherCompany).get(programmer).compareTo(companyPreferences.get(otherCompany).get(otherProgrammer)) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}