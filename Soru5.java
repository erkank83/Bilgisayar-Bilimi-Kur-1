import java.util.Scanner;

public class Soru5 {

    static int sayi1,sayi2;//Global değişenler


    public static boolean asalKontrol(int sayi){
        int sayac=0;// yerel değişkenler
        for (int i = 2; i <=sayi ; i++) {
            if (sayi%i==0)sayac++;
        }
        if (sayac==1)return true;
        else return false;
    }

    public static int enBuyukBul(int sayi1,int sayi2){
        int sayi=0;
        if (sayi1>sayi2){
            sayi=sayi1;
        }else if (sayi2>sayi1){
            sayi=sayi2;
        }else {
            sayi=sayi1;
        }
        return sayi;
    }


    public static int ekok(int sayi1,int sayi2){
        int ekok=1;
        int sayi=enBuyukBul(sayi1,sayi2);

        for (int i = 2; i <=sayi ; i++) {

            if (asalKontrol(i)){

                while (sayi1 %i==0 || sayi2%i==0)
                {

                    System.out.printf("%d\t%d\t| %d \n",sayi1,sayi2,i);
                    ekok*=i;
                    if ( sayi2%i==0){
                        sayi2=sayi2/i;
                    }
                    if ( sayi1%i==0) {
                        sayi1=sayi1/i;
                    }

                    if (sayi1==1 && sayi2==1){
                        System.out.printf("%d\t%d    \n",sayi1,sayi2);
                    }

                }
            }
        }
        return  ekok;
    }

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        sayi1=Math.abs(oku.nextInt());
        System.out.print("İkinci sayıyı giriniz:");
        sayi2=Math.abs(oku.nextInt());
        System.out.println("Ekok :"+ekok(sayi1,sayi2));
    }































}
