public class ContaLettereNumeri {

    public static void main(String[] args) {
        int contaLettera=0;
        int contaNum=0;
        int contaSpazi=0;
        String parola = "aiso 123io12 h21h 3";

        for(int i=0;i<parola.length();i++){

            switch (parola.charAt(i)) {
            case 'a','b','c','d','e','f','g','h','i','l','m','n','o','p','q','r','s','t','u','v','z':
                contaLettera++;
                break;
        
            case '0','1','2','3','4','5','6','7','8','9':
                contaNum++;
                break;
            case ' ':
            contaSpazi++;

        }

        }

        System.out.println("Le lettere sono: " + contaLettera + "\nI numeri sono: " + contaNum + "\nGli spazi sono:  " + contaSpazi);
    }
}
