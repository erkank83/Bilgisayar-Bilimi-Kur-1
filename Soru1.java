import java.util.Scanner;

public class Soru1 {


    public static boolean asalKontrol(int sayi){
        int sayac=0;
        for (int i = 2; i <=sayi ; i++) {
                if (sayi%i==0)sayac++;
        }
        if (sayac==1)return true;
        else return false;

    }

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi=oku.nextInt();
        boolean dogruMu=asalKontrol(sayi);
        if (dogruMu){
            System.out.println("Asal sayı");
        }else {
            System.out.println("Asal sayı değil");
        }
  }
}
