import java.util.Scanner;

public class Soru3 {

    public static int basamakBul(int sayi){
        int basamak=0;
        do{
            sayi=sayi/10;
            basamak++;
        }while (sayi>0);
        return basamak;
    }
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi=oku.nextInt();
        int sonuc=basamakBul(sayi);
        System.out.printf("%d sayısı %d basamaklıdır.",sayi,sonuc);
    }
}
