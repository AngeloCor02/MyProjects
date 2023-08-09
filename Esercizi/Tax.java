import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};

        double[] priceAfter = new double[4];

        for(int i=0;i<price.length;i++){

            priceAfter[i]=price[i] + (price[i]*13/100);

        }

        // See instructions on Learn the Part (Workbook 6.9)
        System.out.print("The original prices are: ");

        System.out.println(Arrays.toString(price));

        System.out.print("The prices after tax are: ");

        System.out.println(Arrays.toString(priceAfter));

    }
}
