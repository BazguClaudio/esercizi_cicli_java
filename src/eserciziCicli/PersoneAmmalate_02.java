
package eserciziCicli;


public class PersoneAmmalate_02 {
    public static void main(String[] args) {
        int ammalati = 1000,contGiorni = 0;
        int ammalatiSout = ammalati;
        double percGuariti = 20.0;
        while(ammalati > 100){
           double guariti = (double)ammalati / 100 * percGuariti;
           ammalati -= guariti;
           contGiorni += 1;
        }
        System.out.println("per guarire gli ammalati ci sono voluti "+contGiorni+" giorni");
    }
}
