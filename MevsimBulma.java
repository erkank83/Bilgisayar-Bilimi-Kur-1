package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class MevsimBulma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Ay bilgisi giriniz(1-12):");
        int ay = oku.nextInt();
        String hangiAy = "";
        if (ay == 1) hangiAy = "Ocak";
        else if (ay == 2) hangiAy = "Şubat";
        else if (ay == 3) hangiAy = "Mart";
        else if (ay == 4) hangiAy = "Nisan";
        else if (ay == 5) hangiAy = "Mayıs";
        else if (ay == 6) hangiAy = "Haziran";
        else if (ay == 7) hangiAy = "Temmuz";
        else if (ay == 8) hangiAy = "Ağustos";
        else if (ay == 9) hangiAy = "Eylül";
        else if (ay == 10) hangiAy = "Ekim";
        else if (ay == 11) hangiAy = "Kasım";
        else if (ay == 12) hangiAy = "Aralık";
        System.out.printf("Girmiş olduğunuz ay: %s", hangiAy);
    }
}