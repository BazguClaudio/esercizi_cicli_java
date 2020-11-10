package eserciziCicli;


public class PersoneAmmalate_01 {


      public static void main(String[] args) {
        int popolazioneSana = 1000,contGiorni = 0;
        double ammalati = 1;
        
        
        while(ammalati < popolazioneSana/2) {
            double vecchiAmmalati = ammalati;
            ammalati *= 1.5;
            ammalati += vecchiAmmalati;
            contGiorni += 1;
        }
        System.out.println("Per contaggiare "+popolazioneSana/2+" di abitanti, ci sono voluti "+ contGiorni +" giorni");
    }
    
}
