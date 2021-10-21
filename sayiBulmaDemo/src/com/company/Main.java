package com.company;

public class Main {

    public static void main(String[] args) {

        int[] sayilar={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean varMi=true;
        int number=25;

        for(int sayi:sayilar){
            if(sayi==number){
                varMi = true;
            }
            else{
                varMi=false;
            }
        }
        if(varMi){
            System.out.println("Sayı dizide mevcut.");
        }
        else{
            System.out.println("Sayı yok.");
        }
	// write your code here
    }
}
