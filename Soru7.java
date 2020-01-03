
import java.util.Scanner;

public class Soru7 {

    public static boolean ucgenOlusurMu(float a,float b,float c){

        boolean sart1=((Math.abs(b-c) < a)&&(a < b+c));
        boolean sart2=((Math.abs(a-c) < b)&&(b < a+c));
        boolean sart3=((Math.abs(a-b) < c)&&(c < a+b));

        if (sart1 && sart2 && sart3)return true;
        else return false;

    }

    public static String ucgenTuru(float a,float b, float c ){

        String mesaj="";

        if ((a==b) &&( b==c) && (a==c))
        {
            mesaj="Eşkanar üçgen";
        }else  if ((a==b) ||( a==c) || (b==c)){
            mesaj="İkizkenar üçgen";
        }else {
            mesaj="Çeşit kenar üçgen";
        }

        return mesaj;
    }

    public static float ucgenCevre(float a,float b, float c){

        return a+b+c;

    }
    public static double ucgenAlan(float a,float b, float c){

        float u=(a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        return Math.ceil(alan);
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
        if (ucgenOlusurMu(a,b,c)){
            System.out.println("Üçgen oluşturur");
            System.out.println("Üçgen Türü :"+ucgenTuru(a,b,c));
            System.out.println("Üçgenin çevresi : "+ucgenCevre(a,b,c));
            System.out.println("Üçgenin alanı :"+ucgenAlan(a,b,c));
        }else{
            System.out.println("Üçgen oluşturmaz");
        }

    }

}
