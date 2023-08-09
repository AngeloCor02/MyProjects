public class Numeri {

    public static void main(String[] args) {
        
       int x=5;
       int y=20;


      //   ScambioVariabili.scambio(x,y);//richiamo metodo da un altra classe

        System.out.print("I numeri divisibili per 3 tra 5 e 20 sono: ");

       for(int i=x;i<=y;i++){

        if(i%3==0){

            System.out.print(i + ", ");

        }

       }

    }

}

