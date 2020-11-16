package esercizicicli;

import java.util.Scanner;

public class SerieNumeri_02 {

    public static boolean isPrimo(int numero) {
        boolean conferma = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                conferma = false;
            }
        }
        return conferma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean inserire = true;
        int countPrimi = 0;
        do {
            System.out.println("Inserisci un numero terminante con 1");
            int num = input.nextInt();
            if (num != 1) {
                if (num > 0) {
                    if (isPrimo(num) == true) {
                        countPrimi += 1;
                    }
                }
            }
            if (num < 0) {
                inserire = false;
            }
        } while (inserire);
        System.out.println("sono stati inseriti " + countPrimi + " numeri primi.");
    }
}
