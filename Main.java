package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner oku=new Scanner(System.in);
        System.out.print("İlk değeri giriniz: ");
        int ilk=oku.nextInt();
        System.out.print("Son değeri giriniz: ");
        int son=oku.nextInt();
        int toplam=0;
        for (int i = ilk; i <son; i++) {
            toplam+=i;
        }
        System.out.printf("%d ile %d arasındaki sayıların toplamı %d",ilk,son,toplam);    }
}
