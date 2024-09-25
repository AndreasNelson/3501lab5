package src;
import java.util.*;

public class Pairing {


    public static Map<String, String> findSatisfactoryPairing(Map<String, Map<String, String>> programmerPreferences, Map<String, Map<String, String>> companyPreferences) {
        // Initialize the set of free programmers
        Set<String> freeProgrammers = new HashSet<>(programmerPreferences.keySet());
        // Initialize the map to store company matches
        Map<String, String> companyMatches = new HashMap<>();
        for (String company : companyPreferences.keySet()) {
            companyMatches.put(company, null);
        }

        // While there are still free programmers
        while (!freeProgrammers.isEmpty()) {
            // Get the next free programmer
            String programmer = freeProgrammers.iterator().next();
            freeProgrammers.remove(programmer);

            // Iterate over the programmer's preferences
            for (String company : programmerPreferences.get(programmer).keySet()) {
                System.out.println("Programmer " + programmer + " is applying to Company " + company);
                // If the company is free, match them
                if (companyMatches.get(company) == null) {
                    System.out.println("Company " + company + " is free and accepts the application from Programmer " + programmer);
                    companyMatches.put(company, programmer);
                    break;
                } else {
                    // If the company is already matched, compare the current match with the new proposal
                    String currentMatch = companyMatches.get(company);
                    System.out.println("Company " + company + " is currently matched with Programmer " + currentMatch);
                    // Check if the company prefers the new programmer over the current match
                    if (companyPreferences.get(company).get(programmer).compareTo(companyPreferences.get(company).get(currentMatch)) < 0) {
                        System.out.println("Company " + company + " prefers Programmer " + programmer + " over Programmer " + currentMatch);
                        System.out.println("Unsatisfactory pairing: " + company + " with " + currentMatch);
                        // Update the match and add the current match back to the free programmers
                        companyMatches.put(company, programmer);
                        freeProgrammers.add(currentMatch);
                        break;
                    } else {
                        System.out.println("Company " + company + " prefers Programmer " + currentMatch + " over Programmer " + programmer);
                    }
                }
            }
        }

        return companyMatches;
    }

    public static boolean isPairingSatisfactory(Map<String, String> pairing, Map<String, Map<String, String>> programmerPreferences, Map<String, Map<String, String>> companyPreferences) {
        // Iterate over each pairing
        for (Map.Entry<String, String> entry : pairing.entrySet()) {
            String company = entry.getKey();
            String programmer = entry.getValue();

            // Check if the programmer prefers another company over their current match
            for (String otherCompany : programmerPreferences.get(programmer).keySet()) {
                if (otherCompany.equals(company)) {
                    break;
                }

                String otherProgrammer = pairing.get(otherCompany);
                System.out.println("Checking if Programmer " + programmer + " prefers Company " + otherCompany + " over Company " + company);
                // If the programmer prefers another company and that company also prefers this programmer, the pairing is not satisfactory
                if (companyPreferences.get(otherCompany).get(programmer).compareTo(companyPreferences.get(otherCompany).get(otherProgrammer)) < 0) {
                    System.out.println("Programmer " + programmer + " prefers Company " + otherCompany + " over Company " + company);
                    return false;
                }
            }
        }
        return true;
    }
}