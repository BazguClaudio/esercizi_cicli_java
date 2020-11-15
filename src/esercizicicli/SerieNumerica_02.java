package esercizicicli;

import java.util.Scanner;

public class SerieNumerica_02 {

    public static void main(String[] args) {
        int numero, controlloNumero;
        boolean num = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        numero = input.nextInt();
        controlloNumero = numero;
        do {
            System.out.println("Inserire un numero: ");
            numero = input.nextInt();
            if (controlloNumero == numero || numero + controlloNumero == 10) {
                num = false;
                System.out.println("ciao");
            }
            controlloNumero = numero;
        } while (num);
    }
}
