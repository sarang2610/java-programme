
import java.util.ArrayList;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter total element");
        int size = sc.nextInt();
        removeDuplicate(size);
        sc.close();

        }

        static void removeDuplicate(int n){
            ArrayList<Integer>  arrayList = new ArrayList<>();

            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                int element = sc.nextInt();
                if(arrayList.contains(element)){
                    continue;
                }
                arrayList.add(element);

                
            }
            System.out.println(arrayList);
        }

        
    }

