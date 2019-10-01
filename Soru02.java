package com.company;

import java.util.Scanner;

public class Soru02 {

      int paketCay=10;
      int paketSayisi;
      float indirim;

    public void okuPaketSayisi(){
        try {
            System.out.print("Paket sayısı giriniz: ");
            Scanner oku=new Scanner(System.in);
            paketSayisi=oku.nextInt();
            if (paketSayisi<10){
                throw new Exception("Paket sayısı 10'dan az olamaz");
            }
        }catch (Exception e){
            System.err.println("Lütfen doğru değerler girin!\nHata :"+e.getLocalizedMessage());
        }
     }

     public  void ayarlaIndirim(){
        if (paketSayisi!=0){

            if ((paketSayisi>=10)&&(paketSayisi<50)){
                indirim=(float)0.05;
            }else  if ((paketSayisi>=50)&&(paketSayisi<100)){
                indirim=(float)0.10;
            }else {
                indirim=(float)0.15;
            }

        }
     }
    public void yazdir(){

        if (paketSayisi>=10){

            double toplam=paketCay*paketSayisi;
            double kdv=toplam*0.08;
            double satis=(toplam+kdv)-(toplam+kdv)*indirim;
            System.out.printf("Toplam:\t%+10.2f TL%nKDV: \t%+10.2f TL%nİndirim:%10.2f TL%nSatiş:\t%+10.2f TL",toplam,kdv,-1*(toplam+kdv)*indirim,satis);
        }

    }
     public static void main(String[] args) {

        Soru02 cozum=new Soru02();
        cozum.okuPaketSayisi();
        cozum.ayarlaIndirim();
        cozum.yazdir();

    }
}
