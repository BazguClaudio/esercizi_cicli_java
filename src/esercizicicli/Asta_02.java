package esercizicicli;

import java.util.Scanner;

public class Asta_02 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int compra1,compra2;
    System.out.println("tocca al compratore 1");
    compra1 = input.nextInt();
    System.out.println("tocca al compratore 2");
    compra2 = input.nextInt();
    if (compra2 < compra1){
        compra2 = 0;
    }
    while(compra1 != 0 && compra2 != 0){
        System.out.println("tocca al compratore 1");
        compra1 += input.nextInt();
        if(compra1 < compra2){
            compra1 = 0; 
        }else{
            System.out.println("tocca al compratore 2");
            compra2 += input.nextInt();
            if(compra2 < compra1){
                compra2 = 0;
            }
        }
        if(compra1 == 0){
            System.out.println("Il secondo compratore "+compra2+" ha vinto");
        }else{
            System.out.println("Il secondo compratore "+compra1+" ha vinto");
        }
    
    }
    }
}