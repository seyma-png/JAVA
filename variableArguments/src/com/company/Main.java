package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sayilar(5,6,4,1,2,8);

    }

    public static void sayilar(int...sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam = toplam+sayi;
        }
        System.out.println(toplam);

    }

}
