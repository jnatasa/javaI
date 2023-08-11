
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wich file should have its conetents printed?");
        String fileName = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String row = fileScanner.nextLine();
                System.out.println(row);
            }
        }catch(NoSuchFileException e){
            System.out.println("File not found: " + fileName);
        }catch(IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
            
        }
    }
}
