
import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String [] elencoPartecipanti = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Inserisci il tuo nome: ");
        String nome = scan.nextLine();

        boolean presente = false;
        for (int i = 0; i < elencoPartecipanti.length; i++){
            if (nome.equals(elencoPartecipanti[i])){
                presente = true;
            }
        }
        if(presente == true) {
            System.out.println("Il nome è presente nella lista...Puoi ENTRARE!");
        }else{
            System.out.println("Il nome non è presente nella lista...Mi DISPIACE!");
        }
    }
}
