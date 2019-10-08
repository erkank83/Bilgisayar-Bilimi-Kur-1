package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soru061 {

    static int negatif;
    static int pozitif;
    static float sayi;

    public static void yaz(){
           System.out.printf("Pozitif sayı: %d%nNegatif sayı: %d%n", pozitif, negatif);
    }

    public static void oku(){
        Scanner oku=new Scanner(System.in);
        System.err.println("Çıkmak için 0 sayısına basınız!");
        while (true){

            try {
                System.out.print("Sayı giriniz :");
                sayi=oku.nextFloat();

                if (sayi==0){
                 throw new Exception("0'a bastınız ve çıktınız");
                }
                if (sayi>0)pozitif++;
                else negatif++;
                yaz();
            }catch (InputMismatchException e){
                System.err.println("Doğru değerler giriniz!");
                return;
            }catch (Exception e1){
                System.err.println("Uyarı: "+e1.getLocalizedMessage());
                return;
            }

        }
    }

    public static void main(String[] args) {
        oku();
    }
}
