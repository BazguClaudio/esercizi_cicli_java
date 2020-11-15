package esercizicicli;
import java.util.Scanner;
public class PariDispari_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int countPari = 0,countDispari = 0;
        System.out.println("Inserisci un numero");
        String num = input.nextLine();
        for(int i = 0; i<num.length();i++){
            char nCh = num.charAt(i);
            int nInt = nCh - '0';
            if(nInt % 2 == 0){
                countPari += 1;
            }
            if(nInt % 2 == 1){
                countDispari += 1;
            }
        }
        System.out.println("il numero "+num+" è composto da "+countPari+" numeri pari e "+countDispari+" numeri dispari.");
    }
}
