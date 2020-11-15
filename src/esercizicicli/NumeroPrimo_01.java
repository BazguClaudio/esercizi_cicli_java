package esercizicicli;
import java.util.Scanner;
public class NumeroPrimo_01 {

    public static String primo(int numero) {
        String conferma = "è primo";
        for (int i = 2; i < numero ; i++) {
            if (numero % i == 0) {
                conferma = "non è primo";
            }
        }
        return conferma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire numero");
        int num = input.nextInt();
        System.out.println(primo(num));
    }
}
