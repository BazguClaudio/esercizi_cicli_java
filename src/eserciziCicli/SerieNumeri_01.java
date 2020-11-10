package eserciziCicli;

import java.util.Scanner;

public class SerieNumeri_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0,countNum = 1;
        System.out.println("Inserisci un numero");
        int numero = input.nextInt();
        count = numero;
        while (numero == count ){
            System.out.println("Inserisci il numero successivo");
            numero = input.nextInt();
            countNum+=1;
            count+=1;
        }
        System.out.println(countNum);
    }
}
