
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int sumOfYears = 0;
        int count = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid input format. Please enter name and birth year separated by a comma.");
                continue;
            }

            String name = parts[0].trim();
            int birthYear = Integer.parseInt(parts[1].trim());

            sumOfYears += birthYear;
            count++;

            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        double averageBirthYear = (double) sumOfYears / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}

