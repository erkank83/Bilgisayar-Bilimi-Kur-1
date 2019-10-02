package com.company;

import java.util.Scanner;

public class Soru003 {

       public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        float a,b,c;
        boolean durum;
        System.out.print("a kenar uzunluğu :");
        a=oku.nextFloat();
        System.out.print("b kenar uzunluğu :");
        b=oku.nextFloat();
        System.out.print("c kenar uzunluğu :");
        c=oku.nextFloat();
        boolean sart1=((Math.abs(b-c) < a)&&(a < b+c));
        boolean sart2=((Math.abs(a-c) < b)&&(b < a+c));
        boolean sart3=((Math.abs(a-b) < c)&&(c < a+b));

        if (sart1 && sart2 && sart3){
            System.out.println("Üçgen oluşur.");
        }else {
            System.out.println("Üçgen oluşmaz.");
        }

    }

}
