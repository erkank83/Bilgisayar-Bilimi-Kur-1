package com.company;

import java.util.Scanner;

public class Soru04 {

    public static void main(String[] args) {
        int sayac=0;
        String isim="";
        Scanner oku=new Scanner(System.in);
        System.err.println("Çıkmak için x|X karakterine basınız!");
        while (true){
            System.out.print("İsim giriniz :");
            isim=oku.next();
            if (isim.equalsIgnoreCase("x"))return;
            sayac++;
            System.out.printf("%s, %d. kişisiniz.%n",isim,sayac);
        }
    }

}
