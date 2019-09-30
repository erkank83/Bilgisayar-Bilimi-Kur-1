
import java.util.Scanner;

public class Soru6 {

    public static float hesaplaYuzeyAlan(float a,float b, float c){

         return 2*(a*b+a*c+b*c);
    }

    public static float hesaplaHacim(float a,float b, float c){
        return a*b*c;
    }


    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float a,b,c;
        System.out.print("a kenar uzunluğu :");
        a=oku.nextFloat();
        System.out.print("b kenar uzunluğu :");
        b=oku.nextFloat();
        System.out.print("c kenar uzunluğu :");
        c=oku.nextFloat();
        System.out.printf(" A = 2 .( ab + ac + bc) \n");
        System.out.printf(" A = %.2f \n",hesaplaYuzeyAlan(a,b,c));
        System.out.printf(" V = a.b.c \n");
        System.out.printf(" V = %.2f \n",hesaplaHacim(a,b,c));
    }
}
