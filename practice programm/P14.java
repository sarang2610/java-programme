import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();
        
        int isEven = (num & 1);
        System.out.println("The number is " + (isEven == 0 ? "even" : "odd"));
    }
}