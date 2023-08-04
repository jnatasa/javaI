
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [][] users = {
            {"alex" , "sunshine"},
            {"emma" , "haskell"}
        };
        
        System.out.println("Enter a username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter a password:");
        String password = scanner.nextLine();
        
        boolean isLoggedIn = false;
        
        for(String[] user : users){
          if (user[0].equals(username) && user[1].equals(password)){
              isLoggedIn = true;
              break;
          }  
        }
        
        if (isLoggedIn){
            System.out.println("You have successfully logged in!");  
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
