public class HighScore {
    public static void main(String[] args) {
        
        int[] numeri = {2,5,1,2,23,32,15,123,32};

        int highScore = 0;
        int position = 0;
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        System.out.print("Here are the scores: ");

        for(int i=0;i<numeri.length;i++){

            System.out.print(numeri[i] + " ");

            if(numeri[i]>highScore){

                highScore=numeri[i];
                position=i;

            }

        }

        System.out.println("\n\nThe highest score is: " + highScore + ". It's placed on the index: " + position);
        
    }    

}
