package com.company;

public class Main {

    public static void main(String[] args) {
        int number=28;
        int total=0;
        boolean mukemmelSayi;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println("Sayı mükemmel sayıdır.");
        }
        else{
            System.out.println("Sayı mükemmel sayı değildir.");
        }
	// write your code here
    }
}
