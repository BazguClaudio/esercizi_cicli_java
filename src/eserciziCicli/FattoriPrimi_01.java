package eserciziCicli;

public class FattoriPrimi_01 {
    public static void main(String[] args){
        int num = 12,i = 2;
        while(num % i != 0){
            if(num % i == 0){
                int resto = num % i;
                System.out.println(resto);
            }
            else if(num % i != 0){
                i+=1;
            }
        }
    }
}
