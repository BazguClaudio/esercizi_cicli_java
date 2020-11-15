package esercizicicli;

public class QuanteCifre_01 {
    public static void main(String[] args){
        int num = 999,count = 0;
        boolean conferma = true;
        while(conferma){
            num = num/10;
            if(num < 1){
                conferma = false;
            }
            count+=1;
        }
        System.out.println("Il numero è composto da "+count+" cifre");
    }
}
