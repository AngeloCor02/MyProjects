import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length); 


        System.out.print("Ticket 1 numbers: ");

        //Task 3 - Call printTicketNumbers for int[] ticket. 

        stampaTicket(ticket2);

        System.out.print("\nTicket 2 numbers: ");

        //Task 3 - Call printTicketNumbers for int[] ticket2.  

        stampaTicket(ticket2);

    } 
    
    public static void stampaTicket(int[] ticket){

        for(int i=0;i<ticket.length;i++){

            System.out.print(ticket[i] + " ");

        }


    }

}

