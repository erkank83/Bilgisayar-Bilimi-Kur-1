import java.util.Scanner;

public class Soru4 {

    public static int topla(int x,int y){

        int toplam=x+y;
        return toplam;
  }

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int sayi1=oku.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int sayi2=oku.nextInt();
        int sonuc=topla(sayi1,sayi2);
        System.out.printf("%d + %d = %d",sayi1,sayi2,sonuc);

    }

}
