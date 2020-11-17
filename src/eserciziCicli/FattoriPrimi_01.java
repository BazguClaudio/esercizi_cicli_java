package eserciziCicli;

public class FattoriPrimi_01 {
    public static void main(String[] args){
        int num = 30,i = 2,numI = 1;
        boolean conferma = true;
        while(conferma){
            if(num % i == 0){
                num = num / i;
                System.out.println(i);
                if(num == 1){
                    conferma = false;
                }
            }
            else if(num % i != 0){
                i+=1;
            }
        }
    }
}
