package esercizicicli;

public class Alghe_01 {

    public static void main(String[] args) {
        int countAnni = 0, popolazioneIniziale = 9, popolazioneFinale = 12;
        boolean conferma = true;
        while (conferma) {
            countAnni += 1;
            if (countAnni % 2 == 1) {
                popolazioneIniziale *= 2;
            }
            if (countAnni % 2 == 0) {
                int calcoloPopolazioneIniziale = popolazioneIniziale / 3;
                popolazioneIniziale -= calcoloPopolazioneIniziale;
            }
            if (popolazioneIniziale == popolazioneFinale) {
                conferma = false;
            }
        }
        System.out.println("ci sono voluti: " + countAnni + " anni.");
    }
}
