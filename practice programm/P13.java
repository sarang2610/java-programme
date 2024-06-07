
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first integers:");
        int a = scanner.nextInt();
        System.out.println("Enter second integers:");
        int b = scanner.nextInt();
        System.out.println("Enter third integers:");
        int c = scanner.nextInt();
        
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int mid = (a + b + c) - (min + max);
        
        System.out.println("Ascending order: " + min + ", " + mid + ", " + max);
    }
}