import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        
        System.out.println("Meow meow!");
        System.out.println(LocalDateTime.now()); // system time
        System.out.printf("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.printf("Inputed value %d", value);
        scanner.close();

    }
}