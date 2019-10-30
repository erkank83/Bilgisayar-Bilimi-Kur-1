package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class UcgenCevreAlan {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kenar uzunluğunu giriniz:");
        float a= oku.nextFloat();
        System.out.print("Yüksekliği giriniz      :");
        float h= oku.nextFloat();
        float alan=(a*h)/2;
        System.out.println("Alan: "+alan);
        float b=(float) Math.sqrt(Math.pow(a,2)+Math.pow(h,2));
        System.out.println("Çevre: "+a+"+"+h+"+"+b+"="+(a+b+h));
    }

}
