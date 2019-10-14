package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	      
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz :");
        int sayi=oku.nextInt();
        int ciftToplam=0;
        for (int i = 0; i <sayi ; i++) {
            if (i%2==0){
                ciftToplam+=i;
               }
        }
        System.out.println("Çift toplam :"+ciftToplam);
    }
}
