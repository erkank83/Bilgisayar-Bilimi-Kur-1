package com.company;

import java.util.Scanner;

public class Soru052 {

    public static void main(String[] args) {
        String durum;
        float  sicaklik=0;
        Scanner oku=new Scanner(System.in);
        System.out.print("Suyun sıcaklığını giriniz:");
        sicaklik=oku.nextFloat();
        if (sicaklik<0)durum="katı";
        else if(sicaklik==0)durum="katı ve sıvı";
        else if(sicaklik>0 && sicaklik<100)durum="sıvı";
        else if (sicaklik==100)durum="sıvı ve gaz";
        else durum="gaz";
        System.out.printf("Su, %.0f°C'de %s halinde bulunur.",sicaklik,durum);
   }

}
