
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = Integer.MIN_VALUE;
        String oldest = "";
        
        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            
        String[] parts = input.split(",");
            if (parts.length != 2) {
                continue;
            }       
        
        
        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        
        if (age > maxAge) {
            maxAge = age;
            oldest = name;
        }
        }
        System.out.println("Name of the oldest: " + oldest + " , " + maxAge );
    }
}
