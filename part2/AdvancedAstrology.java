public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(); 
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        int stars = 1;
        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int spaces = height - 1;
        int stars = 1;
        while (spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars += 2;
        }
     
        printSpaces(height - 2);
        printStars(3);

        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}