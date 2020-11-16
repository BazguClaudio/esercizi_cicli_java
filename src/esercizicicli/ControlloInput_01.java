package esercizicicli;
import java.util.Scanner;

public class ControlloInput_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int totale = 0;
        boolean conferma = true;
        do{
            System.out.println("Inserisci un numero:");
            int num = input.nextInt();
            if(num == 0){
                conferma = false;
            }
            if(num > 0){
                totale += num;
            }
        }while(conferma);
        System.out.println("la somma totale è di "+totale);
    }
}
