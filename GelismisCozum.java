package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class GelismisCozum {

    static Scanner oku=new Scanner(System.in);
    static int ilk,son,toplam;

    public static void oku(){
        try {
            System.out.print("İlk değeri giriniz: ");
            ilk = oku.nextInt();
            System.out.print("Son değeri giriniz: ");
            son = oku.nextInt();
            hesapla();
            yaz();
        }catch (Exception e){
            System.err.println("Uyarı: Lütfen doğru değerler girin!!"+e.getMessage());
        }
    }

    public static void hesapla(){

        for (int i = ilk; i <son; i++) {
            toplam+=i;
        }

    }

    public static void yaz(){
        System.out.printf("%d ile %d arasındaki sayıların toplamı %d",ilk,son,toplam);
    }

    public static void main(String[] args) {
        oku();
    }


}