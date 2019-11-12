package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.Scanner;

public class Daire {

    public static void main(String[] args) {
        double pi=3.141592653589793;
        System.out.print("Dairenin yarı çapını giriniz(cm):");
        Scanner oku=new Scanner(System.in);
        double yariCap=oku.nextDouble();
        double alan=pi*Math.pow(yariCap,2);
        double cevre=2*pi*yariCap;
        System.out.printf("Alan  :%.3f cm%n",alan);
        System.out.printf("Çevre :%.3f cm%n",cevre);

    }



}
