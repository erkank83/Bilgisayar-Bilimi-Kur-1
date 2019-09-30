import java.util.Scanner;

public class Soru2 {


    public static String bolunebilirMi(int sayi){

        String mesaj="";
        if((sayi%3==0) &&(sayi%10==0)){
            mesaj=sayi+", 3'e ve 10'a bölünebilir.";
            }else {
            mesaj=sayi+", 3'e ve 10'a bölünemez.";
         }
        return mesaj;
    }

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayi=oku.nextInt();
        String mesaj=bolunebilirMi(sayi);
        System.out.println(mesaj);

    }


}
