
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "";
        
        while(!answer.equalsIgnoreCase("no")) {
            System.out.println("Shall we carry on?");
            answer = scanner.nextLine();
           
        }
    }
}
