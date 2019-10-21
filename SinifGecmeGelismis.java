package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class SinifGecmeGelismis {

   static   Scanner oku = new Scanner(System.in);
   static float ortalama,devamsizlik;
   static String durum;

   public static void yaz(){

       System.out.println("Durum : "+durum);
   }

   public static void hesapla(){
       if (ortalama >= 50 && devamsizlik < 10) {
           durum="Geçti";
       } else {
           durum="Kaldı";
       }
   }

   public static void oku(){
       try {
            System.out.print("Ortalama giriniz:");
            ortalama = oku.nextFloat();
            System.out.print("Özürsüz devamsizlik süresi giriniz:");
            devamsizlik = oku.nextFloat();
            hesapla();
            yaz();
       }catch (Exception e){
                 System.err.println("Uyarı:Lütfen doğru değerler girin!!");
       }

   }
    public static void main(String[] args) {
              oku();
   }
}