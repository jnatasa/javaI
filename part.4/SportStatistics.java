
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          
        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Match> matches = readMatchesFromFile(file);
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int gamesPlayed = countGamesPlayed(matches, team);
        int wins = countWins(matches, team);
        int losses = gamesPlayed - wins;

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
     public static ArrayList<Match> readMatchesFromFile(String file) {
        ArrayList<Match> matches = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0].trim();
                String visitingTeam = parts[1].trim();
                int homeTeamPoints = Integer.parseInt(parts[2].trim());
                int visitingTeamPoints = Integer.parseInt(parts[3].trim());
                matches.add(new Match(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return matches;
    }
     public static int countGamesPlayed(ArrayList<Match> matches, String team) {
        int count = 0;
        for (Match match : matches) {
            if (match.involvesTeam(team)) {
                count++;
            }
        }
        return count;
    }

    public static int countWins(ArrayList<Match> matches, String team) {
        int wins = 0;
        for (Match match : matches) {
            if (match.getWinner().equals(team)) {
                wins++;
            }
        }
        return wins;
    }

}
class Match {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public boolean involvesTeam(String team) {
        return homeTeam.equals(team) || visitingTeam.equals(team);
    }

    public String getWinner() {
        return homeTeamPoints > visitingTeamPoints ? homeTeam : visitingTeam;
    }
}