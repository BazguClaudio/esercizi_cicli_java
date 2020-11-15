package esercizicicli;

public class Alghe_01 {

    public static void main(String[] args) {
        int countAnni = 1, popolazioneIniziale = 9, popolazioneFinale = 12;
        boolean conferma = true;
        do {
            if (countAnni % 2 == 1) {
                popolazioneIniziale *= 2;
            }
            if (countAnni % 2 == 0 ) {
                int calcolopopolazioneIniziale = popolazioneIniziale/3;
                popolazioneIniziale -= calcolopopolazioneIniziale;
            }
            countAnni += 1;
            if (popolazioneIniziale == popolazioneFinale) {
                conferma = false;
            }

        } while (conferma);
        System.out.println("ci sono voluti: "+ countAnni+" anni." );
    }
}
