package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MevsimBulma2 {

    public static void oku() {
    try {
       Scanner okuVeri=new Scanner(System.in);
       System.out.print("Ay bilgisi giriniz(1-12):");
        int ay=okuVeri.nextInt();
        if (ay>12||ay<1) {
            throw new Exception("1-12 arasında değer giriniz!");
        }
        String metin=hesapla(ay);
        yaz(metin);


    }catch (InputMismatchException e1){
        System.err.println("Uyarı: Lütfen doğru değerler giriniz!");
    }catch (Exception e){
        System.err.println("Uyarı:"+e.getMessage());
    }

    }
    public static String hesapla(int ay){
        String hangiAy="";
        switch (ay) {
            case 1:hangiAy = "Ocak";   break;
            case 2:hangiAy = "Şubat";  break;
            case 3:hangiAy = "Mart";   break;
            case 4:hangiAy = "Nisan";  break;
            case 5:hangiAy = "Mayıs";  break;
            case 6:hangiAy = "Haziran";break;
            case 7:hangiAy = "Temmuz"; break;
            case 8:hangiAy = "Ağustos";break;
            case 9:hangiAy = "Eylül";  break;
            case 10:hangiAy = "Ekim";  break;
            case 11:hangiAy = "Kasım"; break;
            case 12:hangiAy = "Aralık";break;
        }
        return hangiAy;
    }

        public static void yaz(String metin){
            System.out.printf("Girmiş olduğunuz ay: %s", metin);
      }

    public static void main(String[] args) {
        oku();
    }

}