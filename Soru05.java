package com.company;

import java.util.Scanner;

public class Soru05 {

    String durum;
    float sicaklik;
    boolean hata=false;


    public void giris(){

        try {
            Scanner oku=new Scanner(System.in);

            System.out.print("Suyun sıcaklığını giriniz:");
            sicaklik=oku.nextFloat();
        }catch (Exception e){
            hata=true;
            System.err.println("Hata :"+e.getLocalizedMessage());
        }
    }

    public void bulDurum(){
        if (sicaklik<0)durum="katı";
        else if(sicaklik==0)durum="katı ve sıvı";
        else if(sicaklik>0 && sicaklik<100)durum="sıvı";
        else if (sicaklik==100)durum="sıvı ve gaz";
        else durum="gaz";
    }

     public void yaz(){
      if (!hata)
      System.out.printf("Su, %.0f°C'de %s halinde bulunur.",sicaklik,durum);
     }

     public static void main(String[] args) {

        Soru05 coz=new Soru05();
        coz.giris();
        coz.bulDurum();
        coz.yaz();


     }

}
