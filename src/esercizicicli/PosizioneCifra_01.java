package esercizicicli;

public class PosizioneCifra_01 {

    public static void main(String[] args) {
        String numStr = "023678456";
        for (int i = 0; i < numStr.length(); i++) {
            char charNum = numStr.charAt(i);
            int num = charNum - '0';
            if (num > i) {
                System.out.println("Il numero: " + num + " è maggiore");
            }else if (num < i) {
                System.out.println("Il numero: " + num + " è minore");
            }else{
                System.out.println("Il numero " + num + " è uguale");
            }
        }
    }
}
