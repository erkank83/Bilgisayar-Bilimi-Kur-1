package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Ortalama giriniz:");
        float ortalama = oku.nextFloat();
        System.out.print("Özürsüz devamsizlik süresi giriniz:");
        float devamsizlik = oku.nextFloat();
        if (ortalama >= 50 && devamsizlik < 10) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }
    }
}






