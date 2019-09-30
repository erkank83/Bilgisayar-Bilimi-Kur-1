import java.util.Scanner;

public class Soru01 {

    public static String ilkHarfBuyukYap(String isim){
      return isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length());
    }
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("İsminizi giriniz: ");
        String isim=oku.next();
        isim=ilkHarfBuyukYap(isim);
        System.out.printf(" Merhaba '%s'",isim);
    }

}
