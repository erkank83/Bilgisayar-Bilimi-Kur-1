package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class Mevsim {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir ay sayısı giriniz :");
        int ay=oku.nextInt();
        String mevsim="";
        if (ay==12 || ay==1 || ay==2){ mevsim="Kış";}
        else if (ay==3 || ay==4 || ay==5){ mevsim="İlkbahar";}
        else if (ay==6 || ay==7 || ay==8){ mevsim="Yaz";}
        else if (ay==9 || ay==10 || ay==11){ mevsim="Sonbahar";}
        else{
            System.out.println("Lütfen 1-12 arasında değer girin");
            return;
        }
        System.out.printf("Girilen ay %d, mevsim ise %s",ay,mevsim);
    }
}
