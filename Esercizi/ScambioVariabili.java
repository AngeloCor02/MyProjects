public class ScambioVariabili {

public static void scambio(int x, int y){

    int z=0;

    z=x;
    x=y;
    y=z;

    System.out.println("--------Variabili Scambiate--------");

    System.out.println("x= " + x);

    System.out.println("y= " + y);

}
    public static void main(String[] args) {
        int x=4;
        int y= 20;

        System.out.println("--------Variabili Iniziali--------");

        System.out.println("x= " + x);

        System.out.println("y= " + y);

        scambio(x,y);


    }
}
