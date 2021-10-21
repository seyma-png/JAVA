package com.company;

public class Main {

    public static void main(String[] args) {
        boolean asalMi = false;
        int number=-2;
        for(int i=2;i<number;i++){
            if(number%i==0){
                asalMi=false;

            }
            else{
                asalMi=true;
            }
        }
        if(asalMi){
            System.out.println("Sayı asaldır.");
        }
        else if(number<=1){
            System.out.println("En küçük asal sayı 2' dir.");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }
	// write your code here
    }
}
