package com.company;

import java.util.Scanner;

public class Soru06 {

    public static void main(String[] args) {
        int negatif=0;
        int pozitif=0;
        float sayi;
        Scanner oku=new Scanner(System.in);
        System.err.println("Çıkmak için 0 sayısına basınız!");
        while (true){
            System.out.print("Sayı giriniz :");
            sayi=oku.nextFloat();
            if (sayi==0)return;
            if (sayi>0)pozitif++;
            else negatif++;

            System.out.printf("Pozitif sayı: %d%nNegatif sayı: %d%n",pozitif,negatif);
        }
    }

}
