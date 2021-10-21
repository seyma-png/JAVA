package com.company;

public class Main {

    public static void main(String[] args) {

        String mesaj="Java nesne yönelimli bir programlama dilidir.";
        System.out.println(mesaj.charAt(6));
        System.out.println(mesaj.concat(" Baya iyi"));
        System.out.println(mesaj.startsWith("C"));
        System.out.println(mesaj.endsWith("s"));
        char[] myArray=new char[15];
        mesaj.getChars(0,15,myArray,0);
        System.out.println(myArray);
        System.out.println(mesaj.indexOf('e'));
        System.out.println(mesaj.indent(6));
        System.out.println(mesaj.lastIndexOf('d'));
        String yenimesaj=mesaj.replace('a','y');
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(10,20));
        for(String kelime:mesaj.split("a")){
            System.out.println(kelime);

        }

	// write your code here
    }
}
