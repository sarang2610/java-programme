
import java.util.Scanner;

public  class  P10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of squre");
        int size = sc.nextInt();
        
        System.out.println("enter the charactor");
        String c = sc.next();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==0 || i==size-1 || j == 0 || j ==size-1){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
}