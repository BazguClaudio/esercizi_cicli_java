package esercizicicli;

public class DepositoBancario_01 {

    public static double calcoloDenaro(double interesse,double denaro, int anniTotale) {
        double calcoloInteresse = 0;
        while (anniTotale > 0) {
            calcoloInteresse = (denaro * interesse) / 100;
            denaro += calcoloInteresse;
            anniTotale -= 1;
        }
        return denaro;
    }

    public static void main(String[] args) {
        double denaro = 1000, interesse = 20; 
        int anniTotale = 5;
        System.out.println(Math.round(calcoloDenaro(interesse, denaro, anniTotale))+ "€");
    }
}
