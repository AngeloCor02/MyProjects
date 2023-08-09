import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFa(celsius);
        
        System.out.print("\nCelsius: ");

        System.out.println(stampaTemp(celsius));

        System.out.print("\nFehrenheit:");

        System.out.println(stampaTemp(fahrenheit));

        System.out.println();

    }

    public static double[] celsiusToFa(double[] celsius){

        double[] fahrenheit = new double[celsius.length];

        for(int i=0;i<celsius.length;i++){

            fahrenheit[i]= 32 + (celsius[i]*9/5);

        }

        return fahrenheit;

    }

    public static String stampaTemp(double[] temp){

        return Arrays.toString(temp);

    }

}
