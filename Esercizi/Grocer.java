import java.util.Scanner;

public class Grocer {

    public static void main(String[] args) {
        
        //each index is an aisle
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        

        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want buy\n");
        String chose = scan.nextLine();

        for (int i = 0; i < store.length; i++) {
            if (store[i].equals(chose)) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }

        scan.close();
    
    }
}
