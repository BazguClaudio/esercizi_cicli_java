package eserciziCicli;

import java.util.Scanner;

public class PaninoPastina_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soldiMario;
        int quantPastina = 0, quantPanino = 0, giorni = 0;
        int giorniSout = giorni;
        System.out.println("quanti soldi ha mario?");
        soldiMario = input.nextDouble();
        final double pastina = 1;
        final double panino = 1.5;
        boolean vuoiMangiare = true;
        while (soldiMario > 0 && vuoiMangiare) {
            System.out.println("ciao mario vuoi mangiare?");

            String conferma = "";
            conferma = input.nextLine();
            if (conferma.equals("no")) {
                vuoiMangiare = false;
            }
            if (conferma.equals("si")) {
                giorni += 1;
                while (vuoiMangiare) {
                    System.out.println("cosa vuoi mangiare: panino o pastina?");
                    String cibo = input.nextLine();
                    if (cibo.equals("panino")) {
                        if (soldiMario >= 1.5) {
                            soldiMario -= panino;
                            quantPanino += 1;
                           
                        } else {
                            System.out.println("non hai soldi a diposizione");
                        }
                    }
                    if (cibo.equals("pastina")) {
                        if (soldiMario >= 1) {
                            soldiMario -= pastina;
                            quantPastina += 1;
                            
                        } else {
                            System.out.println("non hai soldi a diposizione");
                        }
                    }
                    System.out.println("hai ancora fame?");
                    conferma = input.nextLine();
                    if (conferma.equals("no")) {
                        vuoiMangiare = false;
                    }
                }
            }
        }
        System.out.println("mario ha mangiato " + quantPanino + " panini e " + quantPastina + " pastine per " + giorniSout + " giorni.");
    }
}
