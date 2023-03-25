import java.util.Scanner;

public class task_name {
    
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); // clear console
        System.out.printf("Input your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
        scanner.close();
    }
}
