package eserciziCicli;

import java.util.Scanner;

public class Asta_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int compra1 = 1, compra2 = 1, i = 1, offertaMaggiore = 0;
        System.out.println("Inizio asta");
        System.out.println("Inserire un prezzo maggiore di 1");
        System.out.println("tocca al primo compratore");
        compra1 = input.nextInt();
        System.out.println("tocca al secondo compratore");
        compra2 = input.nextInt();
        while (compra1 != 0 && compra2 != 0) {
            if (i % 2 == 1) {
                System.out.println("tocca al primo compratore");
                compra1 = input.nextInt();
            }
            if (i % 2 == 0) {
                System.out.println("tocca al secondo compratore");
                compra2 = input.nextInt();
            }
            if(compra1 == compra2){
                System.out.println("asta ricominciata, evitare di inserire lo stesso prezzo dell'altro compratore");
                compra1 = 1;
                compra2 = 1;
            }
            if(compra1 < compra2-1){
                compra1 = 0;
            }
            if(compra2 < compra1-1){
                compra2 = 0;
            }
            offertaMaggiore = Math.max(compra1, compra2);
            
            i += 1;
        }
        System.out.println("Fine asta");
        if (compra1 == offertaMaggiore) {
            System.out.println("il primo compratore ha vinto l'asta offrendo " + offertaMaggiore);
        }
        if (compra2 == offertaMaggiore) {
            System.out.println("il secondo compratore ha vinto l'asta offrendo " + offertaMaggiore);
        }

    }

}
