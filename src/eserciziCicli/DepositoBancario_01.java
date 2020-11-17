package esercizicicli;

public class DepositoBancario_01 {

    public static int calcoloDenaro(double interesse,double denaro, double soglia) {
        double calcoloInteresse = 0;
        int anni = 0;
        while (soglia > denaro) {
        calcoloInteresse = (denaro * interesse) / 100;
        denaro += calcoloInteresse;
        anni+=1;
        }
        return anni;
    }

    public static void main(String[] args) {
        double denaro = 100, interesse = 10,soglia = 1000; 
        System.out.println("Ci sono voluti "+calcoloDenaro(interesse, denaro, soglia)+" anni");
    }
}
