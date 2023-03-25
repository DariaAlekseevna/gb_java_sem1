import java.util.Scanner;

public class ProgramScanner {
    
    private static int readInt(Scanner scanner, String message) {
        System.out.print(message);
        int value = scanner.nextInt();
        return value;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello!!!");
        int value = readInt(scanner, "Enter number: ");
        System.out.printf("Inputed value: %d", value);
        scanner.close();
    }
}
