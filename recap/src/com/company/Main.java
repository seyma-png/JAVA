package com.company;

public class Main {

    public static void main(String[] args) {

        double total=0;

        String[] array=new String[15];
        double[] myList={10,15,20,25};
        double max=myList[0];
        for(double number:myList){
            if(max<number) {
                max = number;
            }
            total=total+number;
            System.out.println(number);
        }

        System.out.println("Toplam:"+total);
        System.out.println("En büyük sayı:"+max);

    }
}
