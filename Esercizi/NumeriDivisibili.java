import java.util.Scanner;
public class NumeriDivisibili {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci numero: ");
        int x = scan.nextInt();

        for(int i = x-1;i>1;i--){

            if(x%i==0){
                System.out.print(i + " ");
            }

        }
    
        scan.close();
    }
}
