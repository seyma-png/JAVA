package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String mesaj;
        metodum();
    }

    public static void metodum() {

        int number=10;
        int total=0;
        boolean mukemmelSayi;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total+i;
            }
        }
        if(total==number){
            String mesaj="Mükemmel sayıdır:" +number;
            mesaj(mesaj);
        }
        else{
            String mesaj="Sayı mükemmel sayı değildir:" +number;
            mesaj(mesaj);
        }

    }
    public static void mesaj(String mesaj) {
        System.out.println(mesaj);

    }
}
